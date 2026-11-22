#!/bin/bash
echo "| Comp | Compiling all into ./com/"
javac -g -verbose -d . src/*.java
echo "| Comp | Compiling finished"
echo "| Jar  | Making jar"
jar cvfe FTC.jar FTCMain com/csayer/MotorSystem/*.class
echo "| Jar  | Done making jar"  
echo "| Run  | Running"
java com.csayer.MotorSystem.FTCMain
echo "| Run  | Done running"