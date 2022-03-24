FROM debian:11

RUN apt update
RUN apt install -y openjdk-17-jdk
ADD ./gradlew /app/
ADD ./gradle /app/gradle/

WORKDIR /app
RUN ./gradlew --no-daemon

