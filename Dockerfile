FROM ubuntu:bionic

MAINTAINER john@deckerego.net

RUN apt-get --assume-yes update
RUN apt-get --assume-yes install openjdk-8-jre tesseract-ocr libopencv3.2-jni

ARG DOCIDX_VERSION=0.2.0
ADD target/docidx-${DOCIDX_VERSION}.jar /opt/docidx/docidx.jar

VOLUME /mnt/docs

WORKDIR /opt/docidx

ENTRYPOINT [ "java", "-Djava.library.path=/usr/lib/jni/", "-jar", "docidx.jar"]
