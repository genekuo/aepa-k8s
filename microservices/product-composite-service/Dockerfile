# FROM openjdk:12.0.2
FROM openjdk:12-alpine

EXPOSE 8080

ADD ./build/libs/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
