#!/bin/bash

# -----------------MySQL Ubuntu ----------------------------------------------------
echo "Creating container vm-mysql-ubuntu"
docker run --name vm-mysql-ubuntu -d image-mysql-ubuntu


# -------------------- Maria DB ---------------------------------------------------

echo "Creating container vm-mysql-fedora"
docker run --name vm-mariadb -e MYSQL_ROOT_PASSWORD=root -d mariadb

# -------------------- Mongo DB --------------------------------------------------

echo "Creating container vm-mongo"
docker run --name vm-mongo -d image-mongo

# ------------------- Cassandra --------------------------------------------------

echo "Creating container vm-cassandra"
docker run --name vm-cassandra -d cassandra

