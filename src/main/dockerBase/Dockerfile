FROM openjdk:19-jdk-slim


ENV JAVA_OPTS " -Xms512m -Xmx512m -Djava.security.egd=file:/dev/./urandom"

WORKDIR application

COPY ../../../target/KBE-SpingBootRest-0.0.1-SNAPSHOT.jar ./

ENTRYPOINT ["java", "-jar", "KBE-SpingBootRest-0.0.1-SNAPSHOT.jar"]