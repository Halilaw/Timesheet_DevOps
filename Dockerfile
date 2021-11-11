FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD /target/devops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","devops-0.0.1-SNAPSHOT.jar"]
