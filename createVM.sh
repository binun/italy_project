#!/bin/bash

docker rm -f $(docker ps -a -q)

docker run --name vm-mysql --publish-all=true -d image-mysql
# mysql -u root -p , mysql -u root

docker run --name vm-cassandra --publish-all=true -d image-cassandra

docker run --name vm-mongodb --publish-all=true -d image-mongodb

docker run --name vm-mariadb -p 5555:5555 --publish-all=true -e MYSQL_ROOT_PASSWORD=root -d mariadb
# mysql -u root -proot
