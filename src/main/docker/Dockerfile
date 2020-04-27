# Extending our own wildfly image here
FROM jboss/wildfly

ARG BUILD_DATE
LABEL mark.docker.image=mark-log-sample \
      mark.build.date=$BUILD_DATE

ADD ./logexample-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/
