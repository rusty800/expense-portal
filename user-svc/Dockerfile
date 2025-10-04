FROM maven:latest AS build

WORKDIR /user-svc
COPY /pom.xml .
COPY /src ./src

# Build & run tests
RUN mvn clean package

FROM openjdk:latest

WORKDIR /user-svc

# Copy only the fat jar
COPY --from=build /user-svc/target/user-svc-0.0.1-SNAPSHOT.jar user-svc.jar

# Default command: run program
CMD ["java", "-jar", "user-svc.jar"]
