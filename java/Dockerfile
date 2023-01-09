# Build Stage
FROM gradle:jdk8 AS BUILD_STAGE
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY . .
RUN gradle build || return 1

# Package stage
FROM openjdk:8-jre-slim
ENV JAR_NAME=recommendations-1.0-SNAPSHOT.jar
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 50051
ENTRYPOINT exec java -jar $APP_HOME/build/libs/$JAR_NAME  