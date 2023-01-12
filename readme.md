The idea of this solution is show how you can use a grpc service from a react application using envoy as middle server

The example is about a book recommendations service


URL's base
Based on the code on the url below:
1. https://medium.com/geekculture/grpc-between-java-and-reactjs-bbfefe42a1a6

Adapted in order to have as a sever a python solution as is resolved on the url below:
2. https://realpython.com/python-microservices-grpc/


Steps for the server (as in the second url):
1. Install venv
with the requirements.txt file
activate base if you're in conda and then
python3 -m venv venv
python -m pip install -r python/requirements.txt
2. Define the proto file
3. Compile the file to generate clasess on python
Go to python directory and execute
python -m grpc_tools.protoc -I ../proto --python_out=. ^
--grpc_python_out=. ../proto/recommendations.proto
3. Create a grpc service
you can find the use on the file recommendations.py

Steps for the client (as in the first url)
code with the right package.json file located on grpc-react folder
You should manually install the protoc and protoc-gen-grp-web "executables"
https://github.com/protocolbuffers/protobuf/releases?q=3.11&expanded=true
https://github.com/grpc/grpc-web/releases
Look for the assets in the two urls above

Once the tools are installed go where the proto file was defined (proto/) and execute
protoc ./recommendations.proto --js_out=import_style=commonjs:../react-grpc/src/output --grpc-web_out=import_style=typescript,mode=grpcwebtext:../react-grpc/src/output

The previous command would generate the files on react-grpc/src/output

Now once the basic react application was created and the proto code was generated it's time to try to communicate betwee python and react
Don't forget for the react packages fix
npm audit -production. 
Url explaining why: https://github.com/facebook/create-react-app/issues/11174



To test the service is running you can create a python session and test manually what's happening following the instructions on the second url' base
go to the python folder and activate venv
.\venv\Scripts\activate
python

>>> import grpc
>>> from recommendations_pb2_grpc import RecommendationsStub
>>> channel = grpc.insecure_channel("localhost:50051")
>>> client = RecommendationsStub(channel)

Make request
>>> from recommendations_pb2 import BookCategory, RecommendationRequest
>>> request = RecommendationRequest(
...    user_id=1, category=BookCategory.SCIENCE_FICTION, max_results=3)
>>> client.Recommend(request)
recommendations {
  id: 6
  title: "The Dune Chronicles"
}
recommendations {
  id: 4
  title: "The Hitchhiker\'s Guide To The Galaxy"
}
recommendations {
  id: 5
  title: "Ender\'s Game"
}

The react application is in react-grpc folder
npm start

In order to run the react application you need to start envoy
Using docker
docker-compose up and it creates the envoy and python application in two images that run together. 

Creating for java. Code base on ./java folder

The example is using gradle no maven. So a gradle project was created

Go to dependencies on build.gradle and add
    // these are the dependecies related to grpc
    implementation 'io.grpc:grpc-netty-shaded:1.40.1'
    implementation 'io.grpc:grpc-protobuf:1.40.1'
    implementation 'io.grpc:grpc-stub:1.40.1'
    compileOnly 'org.apache.tomcat:annotations-api:6.0.53' // necessary for Java 9+

In order to create the java source based on proto file go where the proto file is defined and execute
protoc -I="./" --plugin=protoc-gen-grpc-java=D:\protoc-3.18\bin\protoc-gen-grpc-java.exe --grpc-java_out="./../java/src/main/java" --java_out="./../java/src/main/java" "./recommendations.proto"

It didn't work so I went to url below:
https://intuting.medium.com/implement-grpc-service-using-java-gradle-7a54258b60b8
create folder and file as explained in the video
src/main/proto/recommendations.proto
Change the proto file to add a java package
package org.proto;

I've applied a some changes to the build.gradle file in order to match the current installed tools
def grpcVersion = '1.40.1'
compile group: 'com.google.protobuf', name: 'protobuf-java-util', version: '3.18.0'

Then gradle build and the files were generated on
generated/source/proto/main in grpc and java respectively

To use the previous code create a package in src/main/java and create the Service and Serve as below.
Service

For Java I modified the proto file adding the package. So I have to update the proto file used for the react generation and regenerate again the grpc java scripts. Once that one is done I could call properly the API from react. 