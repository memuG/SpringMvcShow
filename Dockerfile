FROM openjdk:11-jre-slim

WORKDIR "/tmp"
COPY "target/conference-0.0.1-SNAPSHOT.jar" "/tmp"

ENTRYPOINT ["java", "-jar", "/tmp/conference-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080