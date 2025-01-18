FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/Employee-0.0.1-SNAPSHOT.jar employee-v1.jar
ENTRYPOINT ["java", "-jar", "/app/employee-v1.jar"]
EXPOSE 8080

