#!/bin/bash
source ./platforms.sh
./rmall.sh

for platform in "${platforms[@]}"
do
   cd $platform
   echo $(pwd)
   docker build -t image-$platform .
   cd ..
done

#docker pull mariadb
