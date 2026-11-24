#!/bin/bash

#You CANNOT run this on Windows!
#I just realized this!

RST="\033[0m"
BRKS="\033[1;97m[${RST}"
BRKE="\033[1;97m]${RST}"
BLU="\033[0;34m"
RED="\033[0;31m"
GRN="\033[0;32m"

echo -e "${BRKS} ${BLU}Comp${RST} ${BRKE}     Compiling all into ./ShellBuild     ${BRKS} ${BLU}Comp${RST} ${BRKE}"
javac  -d ./ShellBuild/ ./src/com/csayer/MotorSystem/*.java
echo -e "${BRKS} ${BLU}Comp${RST} ${BRKE}           Compiling finished         ${BRKS} ${BLU}Comp${RST} ${BRKE}"

echo -e "${BRKS} ${RED}Jar${RST} ${BRKE}                Making jar             ${BRKS} ${RED}Jar${RST} ${BRKE}"
jar cvfe FTC.jar com.csayer.MotorSystem.FTCMain ShellBuild/com/csayer/MotorSystem/*.class
echo -e "${BRKS} ${RED}Jar${RST} ${BRKE}             Done making jar           ${BRKS} ${RED}Jar${RST} ${BRKE}"

echo -e "${BRKS} ${GRN}Run${RST} ${BRKE}              Running class            ${BRKS} ${GRN}Run${RST} ${BRKE}"
cd ShellBuild && java com.csayer.MotorSystem.FTCMain && cd ..
echo -e "${BRKS} ${GRN}Run${RST} ${BRKE}           Done running class          ${BRKS} ${GRN}Run${RST} ${BRKE}"

echo -e "${BRKS} ${GRN}Run${RST} ${BRKE}              Running JAR              ${BRKS} ${GRN}Run${RST} ${BRKE}"
java -jar FTC.jar
echo -e "${BRKS} ${GRN}Run${RST} ${BRKE}            Done running JAR           ${BRKS} ${GRN}Run${RST} ${BRKE}"