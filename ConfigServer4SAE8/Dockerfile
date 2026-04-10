FROM eclipse-temurin:17
EXPOSE 8686
ADD target/ConfigServer4SAE8-0.0.1-SNAPSHOT.jar config.jar
ENTRYPOINT ["java", "-jar", "config.jar"]