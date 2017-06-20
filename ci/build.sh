#!/usr/bin/env bash
set -e -x

apk update
apk add git

git clone https://github.com/mivanova1/demo resource-app

pwd

cd resource-app
./gradlew clean assemble

ls -al build
ls -al build/libs

pwd


