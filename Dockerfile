FROM openjdk:8-jdk-alpine3.8
VOLUME [ "/tmp" ]
ADD target/Gestion*.jar /app.jar
CMD [ "java", "-jar", "/app.jar", "--spring.profiles.active=prod" ]
EXPOSE 8090