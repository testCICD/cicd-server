FROM java:8
WORKDIR /app
ADD ./build/libs/cts-server*.jar /app/cts-server-latest.jar
ENTRYPOINT java -jar /app/cts-server-latest.jar
EXPOSE 8080