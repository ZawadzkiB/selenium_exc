# SETUP

## Install:

### 1. Java 

JDK 8:
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

how to install java:
https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html

after installation type in terminal | cmd

    java -version

output should be

    java version "1.8.0_202"
    Java(TM) SE Runtime Environment (build 1.8.0_202-b08)
    Java HotSpot(TM) 64-Bit Server VM (build 25.202-b08, mixed mode)

also type

    echo $JAVA_HOME or echo %JAVA_HOME%

output should be path to your java installation

### 2. IDE

https://www.jetbrains.com/idea/download

can be community version

### 3. Google Chrome


# App for tests

Download this repo

    git clone https://github.com/ZawadzkiB/selenium_exc.git

then

    cd shopizer_old
    ./mvnw clean install

    cd sm-shop
    ./mvnw spring-boot:run

then open browser on: 
    
    http://localhost:4160