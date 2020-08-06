#!/bin/sh
mvn clean package
java -Dfile.encoding=UTF-8 -cp target/classes com.andres.App