# Extending our own wildfly image here
FROM jboss/wildfly:15

ARG BUILD_DATE
LABEL mark.docker.image=mark-log-sample \
      mark.build.date=$BUILD_DATE

ADD logexample-1.0-SNAPSHOT.war /deployment/
