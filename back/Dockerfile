
FROM maven:3.8.1-jdk-11 AS MAVEN_BUILD
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM openjdk:11 AS RUN
COPY --from=MAVEN_BUILD /tmp/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


