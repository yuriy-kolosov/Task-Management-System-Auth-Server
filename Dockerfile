FROM maven:3.9.9-amazoncorretto-17-al2023 AS build

COPY . /app

WORKDIR /app

RUN mvn clean package -DskipTests=true

# Use the official OpenJDK base image
FROM openjdk:17-jdk-alpine

# Copy the built jar file into the container
COPY --from=build /app/target/tms-auth-server-0.0.1-SNAPSHOT.jar /tms_auth_server_app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "tms_auth_server_app.jar"]