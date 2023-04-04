FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} department-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/department-service-0.0.1-SNAPSHOT.jar"]