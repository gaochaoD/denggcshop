FROM java:8
VOLUME /tmp
ADD shopadmin-1.0-SNAPSHOT.jar /admin-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/admin-server.jar"]


