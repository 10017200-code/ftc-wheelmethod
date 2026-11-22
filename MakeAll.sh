#!/bin/bash
echo "| Comp | Compiling all into ./com/"
javac -g -d . src/*.java
echo "| Comp | Compiling finished"
echo "| Run  | Running..."
java com.csayer.MotorSystem.FTCMain
echo "| Run  | Done running"