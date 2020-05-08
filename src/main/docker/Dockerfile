# Extending our own wildfly image here
FROM jboss/wildfly

ARG BUILD_DATE
LABEL mark.docker.image=mark-log-sample \
      mark.build.date=$BUILD_DATE

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]

ADD ./logexample-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/

# adding our users and user-groups to the dockerized  wildfly
# since `RUN /opt/jboss/wildfly/bin/add-user.sh admin Admin#007 --silent` is not working due to wrong access permissions
COPY ./mgmt-users.properties /opt/jboss/wildfly/standalone/configuration/
COPY ./mgmt-groups.properties /opt/jboss/wildfly/standalone/configuration/
