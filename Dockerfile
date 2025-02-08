# FROM eclipse-temurin:21-jdk-alpine
# LABEL maintainer ="Prashanth"
# WORKDIR product/
# COPY . ./
# ADD target/product-0.0.1-SNAPSHOT.jar product-0.0.1-SNAPSHOT.jar
# ENTRYPOINT ["java","-jar","product-0.0.1-SNAPSHOT.jar"]

# Buildface
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /product/src
COPY pom.xml /product
RUN mvn -f /product/pom.xml clean package

FROM openjdk:11-jre-slim
COPY --from=build /product/target/product-0.0.1-SNAPSHOT.jar /usr/local/lib/product.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/product.jar"]
