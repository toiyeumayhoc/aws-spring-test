FROM openjdk:17-alpine
EXPOSE 8080
COPY target/aws-spring-test.jar app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]