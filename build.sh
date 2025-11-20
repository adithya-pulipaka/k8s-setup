#!/bin/bash

mvn clean install -DskipTests -f main-app/pom.xml
mvn clean install -DskipTests -f weather-app/pom.xml