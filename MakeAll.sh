#!/bin/bash
P="\033[1;97m|\033[0m"

echo -e "${P} Comp ${P} Compiling all into ./com/"
javac -g -verbose -d . src/*.java
echo -e "${P} Comp ${P} Compiling finished"

echo -e "${P} Jar  ${P} Making jar"
jar cvfe FTC.jar com.csayer.MotorSystem.FTCMain com/csayer/MotorSystem/*.class
echo -e "${P} Jar  ${P} Done making jar"  

echo -e "${P} Run  ${P} Running"
java com.csayer.MotorSystem.FTCMain
echo -e "${P} Run  ${P} Done running"