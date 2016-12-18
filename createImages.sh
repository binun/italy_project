#!/bin/bash

./rmall.sh
# -----------------MySQL Ubuntu ----------------------------------------------------
echo "Building MySQL on Ubuntu"
cd ubuntu
docker build -t "image-mysql-ubuntu" .
cd ..

# -------------------- Maria DB ---------------------------------------------------
echo "Building MySQL on Fedora0"
docker pull mariadb

# -------------------- Mongo DB --------------------------------------------------

echo "Building MongoDB image"
cd mongodb
docker build -t "image-mongo" .
cd ..
 
# -------------------- Cassandra -----------------------------------------------

echo "Building Cassandra image"
docker pull cassandra
