FROM openjdk:11
LABEL maintainer ="howtodoinjava"
WORKDIR product/
ADD target/product-0.0.1-SNAPSHOT.jar product-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","product-0.0.1-SNAPSHOT.jar"]
