FROM cassandra

RUN apt-get update --fix-missing && apt-get install -y openjdk-7-jdk

# Define working directory.
WORKDIR /data

ENV JAVA_HOME /usr/lib/jvm/java-7-openjdk-amd64

EXPOSE 5555
