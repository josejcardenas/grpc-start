# Build Stage
FROM gradle:5.3.0-jdk8-alpine AS BUILD
ENV PROTOC_ZIP=protoc-3.19.6-linux-x86_64.zip
USER root
RUN apk update
RUN apk add gcompat unzip curl
RUN curl -OL https://github.com/protocolbuffers/protobuf/releases/download/v3.19.6/$PROTOC_ZIP \
    && unzip -o $PROTOC_ZIP -d /usr/local bin/protoc \
    && unzip -o $PROTOC_ZIP -d /usr/local 'include/*' \ 
    && rm -f $PROTOC_ZIP
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --chown=gradle:gradle . .
USER root
RUN chown -R gradle:gradle $APP_HOME
USER gradle
# RUN gradle build --debug --scan
RUN gradle build
# RUN gradle shadowJar

# Package stage
FROM openjdk:8-jre-slim
ENV JAR_NAME=recommendations-1.0-SNAPSHOT.jar
# ENV JAR_NAME=shadowJar
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 50051
ENTRYPOINT exec java -jar $APP_HOME/build/libs/$JAR_NAME  
