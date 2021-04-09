FROM java:8
VOLUME /tmp
ADD shopspringcloudserve-0.0.1-SNAPSHOT.jar /eureka-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar"]


