FROM eclipse-temurin:17
EXPOSE 8088
ADD target/APIGateway4SAE1-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java", "-jar", "gateway.jar"]