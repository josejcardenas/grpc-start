FROM python:3.8.16-slim

# PRE-REQUISITES
RUN apt-get update
RUN apt-get install -y gnupg2 libssl1.1 apt-transport-https p7zip-full curl
# RUN curl https://packages.microsoft.com/keys/microsoft.asc | apt-key add -
# RUN curl https://packages.microsoft.com/config/debian/9/prod.list > /etc/apt/sources.list.d/mssql-release.list
RUN apt-get update
# RUN ACCEPT_EULA=Y apt-get install -y msodbcsql17 unixodbc unixodbc-dev

# Environment
WORKDIR /usr/src/grpc-server
ADD ./requirements.txt /usr/src/grpc-server/requirements.txt
RUN pip install -r requirements.txt

# Application code
COPY . /usr/src/grpc-server
ENTRYPOINT ["python", "recommendations.py"]