FROM adoptopenjdk/openjdk17

COPY ./build/libs/cicd-with-docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]