FROM clojure:openjdk-8-lein-slim-buster AS build-jar
WORKDIR /usr/src
COPY . .
RUN lein ring uberjar

FROM openjdk:8-jre-alpine
WORKDIR /usr/app
COPY --from=build-jar /usr/src/target/hello-compojure-0.1.0-SNAPSHOT-standalone.jar .
CMD ["java", "-jar", "hello-compojure-0.1.0-SNAPSHOT-standalone.jar"]