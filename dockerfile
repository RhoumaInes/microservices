FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/gestionpublication-0.0.1-SNAPSHOT.jar gestionpublication.jar
ENTRYPOINT ["java","-jar","gestionpublication.jar"]