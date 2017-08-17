FROM java:8
WORKDIR /app
ADD cts-server-latest.jar /app/cts-server-latest.jar
ENTRYPOINT java -jar /app/cts-server-latest.jar
EXPOSE 8080