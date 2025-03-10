FROM maven:3-openjdk-17 AS build
WORKDIR /

COPY . .
RUN mvn clean package -DskipTests


# Run stage

FROM openjdk:17-jdk-slim
WORKDIR /

COPY --from=build /target/DrComputer-0.0.1-SNAPSHOT.war drcomputer.war
EXPOSE 8080 

ENTRYPOINT ["java","-jar","drcomputer.war"]
