FROM openjdk:17-jdk-alpine
COPY target/admin-service.jar .
EXPOSE 8083
ENV EUREKA_HOST=service-registry
ENTRYPOINT ["java", "-jar", "admin-service.jar"]