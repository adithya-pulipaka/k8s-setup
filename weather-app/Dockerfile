FROM amazoncorretto:24.0.1-alpine

COPY target/weather-app-0.0.1-SNAPSHOT.jar weather-app.jar

ENTRYPOINT ["java", "-jar", "weather-app.jar"]