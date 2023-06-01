#!/bin/sh

dir=$(dirname "$(readlink -f "$0")")

java -jar "$dir"/target/quarkus-app/quarkus-run.jar
