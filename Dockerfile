FROM openjdk:17-jdk-slim

ARG NAME_APP=app-authors

COPY ./build/quarkus-app/lib ./lib
COPY ./build/quarkus-app/app ./app
COPY ./build/quarkus-app/quarkus ./quarkus
COPY ./build/quarkus-app/quarkus-app-dependencies.txt ./

COPY ./build/quarkus-app/quarkus-run.jar ./

ENV DB_URL=jdbc:postgresql://db:5432/postgres
ENV DB_USERNAME=postgres
ENV DB_PASSWORD=postgres

CMD ["java", "-jar", "quarkus-run.jar"]

EXPOSE 9099