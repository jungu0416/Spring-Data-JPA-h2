FROM adoptopenjdk/openjdk8:ubi
CMD ["./gradlew", "clean", "build"]
ARG JAR_FILE_PATH=build/libs/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE_PATH} demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]