FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/SpringAPI-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} SpringAPI.jar
ENTRYPOINT ["java","-jar","/SpringAPI.jar"]
