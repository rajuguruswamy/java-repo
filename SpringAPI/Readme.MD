## 1. Add the Dockerfile
FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=target/SpringAPI-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} SpringAPI.jar
ENTRYPOINT ["java","-jar","/SpringAPI.jar"]

## 2. Build the Project JAR
mvn clean package

## 3. Build the Docker Image
docker build -t springapi:latest .

## 4. Run the Docker Container
docker run -p 8080:8080 --name my-spring-api-container springapi:latest