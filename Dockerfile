FROM maven:eclipse-temurin as builder
WORKDIR /app
COPY mvnw pom.xml ./
COPY ./src ./src
RUN mvn clean install -DskipTests

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
EXPOSE 8080
COPY --from=builder /app/target/*.jar app/*.jar
ENTRYPOINT ["java","-jar","app/*.jar"]