FROM adoptopenjdk/openjdk8:ubi
ARG JAR_FILE_PATH=build/libs/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE_PATH} demo-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]