FROM adoptopenjdk/openjdk11:alpine

WORKDIR /app

COPY target/bai1-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "/app/bai1-0.0.1-SNAPSHOT.jar"]