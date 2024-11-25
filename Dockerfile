FROM openjdk:21
EXPOSE 8080
ADD target/spring-boot-docker1.jar spring-boot-docker1.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker1.jar"]