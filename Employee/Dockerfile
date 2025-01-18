FROM openjdk:17-jdk-slim
copy build/libs/Employee-0.0.1-SNAPSHOT-plain.jar employee-v1.jar
ENTRYPOINT ["java", "-jar", "/employee-v1.jar"]