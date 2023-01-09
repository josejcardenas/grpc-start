# Build Stage
FROM gradle:5.3.0-jdk8-alpine AS BUILD
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --chown=gradle:gradle . .
USER root
RUN chown -R gradle:gradle $APP_HOME
RUN gradle build --stacktrace --debug || return 0

# Package stage
FROM openjdk:8-jre-slim
ENV JAR_NAME=recommendations-1.0-SNAPSHOT.jar
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 50051
ENTRYPOINT exec java -jar $APP_HOME/build/libs/$JAR_NAME  
