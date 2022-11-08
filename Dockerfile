FROM openjdk:8
EXPOSE 8080
ADD target/devops-jenkins-integration.jar devops-jenkins-integration.jar
ENTRYPOINT ["java","-jar","devops-jenkins-integration.jar"]