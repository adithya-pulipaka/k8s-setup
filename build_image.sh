#!/bin/bash

eval $(minikube docker-env)

docker build --tag main-app main-app/

docker build --tag weather-app weather-app/