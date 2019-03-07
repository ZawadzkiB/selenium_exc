# SETUP

<b>Please do before workshops</b>

## Install:

### <b>1. Java </b>

Download JDK 8:
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

how to install java:
https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html

important is to set environment variable JAVA_HOME

after installation type in terminal or cmd

    java -version

output should be

    java version "1.8.0_202"
    Java(TM) SE Runtime Environment (build 1.8.0_202-b08)
    Java HotSpot(TM) 64-Bit Server VM (build 25.202-b08, mixed mode)

also type

    echo $JAVA_HOME or echo %JAVA_HOME%

output should be path to your java installation

### <b>2. IDE </b>

https://www.jetbrains.com/idea/download

can be community version

### 3. <b>Google Chrome </b>

latest update please :)


# App for tests

Download/Clone this repo

    git clone https://github.com/ZawadzkiB/selenium_exc.git

then

    cd shopizer_old
    ./mvnw clean install

    cd sm-shop
    ./mvnw spring-boot:run

then open browser on: 
    
<b>`http://localhost:4160`</b>

we will be writing tests for this app :) 