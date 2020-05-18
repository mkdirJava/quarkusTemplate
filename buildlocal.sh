#!/bin/bash

mvn package -Pnative -Dquarkus.native.container-runtime=docker
docker build -f src/main/docker/Dockerfile.native -t quarkus/quarkus-web .
docker run -i --rm -p 8080:8080 quarkus/quarkus-web
