#!/bin/bash
source ./platforms.sh
./rmall.sh

curdir=$(pwd)
for platform in "${platforms[@]}"
do
   cd $platform
   echo $(pwd)
   docker build -t image-$platform .
   cd $curdir
done
