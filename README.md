# ftc-wheelmethod
FTC Java method for an easy way to move wheels (tons of featiures!)

## How to use
These classes mostly contain functions, but FTCMain has examples. The methods have their descriptions inside of their definitions

## Tree
C:.
|   build.gradle                Gradle build settings
|   ftc-wheelmethod.iml         Settings
|   gradlew                     Gradle
|   gradlew.bat                 Gradle script
|   LICENSE                     BSD 3-clause license
|   local.properties            Local properties
|   MakeAll.sh                  Emergency make script if the built in Run on android studio fails, outputs to ShellBuild
|   README.md                   This
|   settings.gradle             Gradle settings
|   
+---.gradle
+---.idea     
+---build                       Built classes from the Run button on Android Studio
|   +---classes
|   |   \---java
|   |       \---main
|   |           \---com
|   |               \---csayer
|   |                   \---MotorSystem
|   |                           FTCMain.class
|   |                           Motor.class
|   |                           MotorSystem.class
|   |                           
|   +---generated
|   \---tmp
|       \---compileJava
|           |   previous-compilation-data.bin
|           |   
|           \---compileTransaction
|               +---backup-dir
|               \---stash-dir
|                       FTCMain.class.uniqueId1
|                       Motor.class.uniqueId2
|                       MotorSystem.class.uniqueId0
|                       
+---gradle
|   \---wrapper
|           gradle-wrapper.jar
|           gradle-wrapper.properties
|           
+---ShellBuild          Compiled stuff from the shell script
|   |   ShellBuild.jar
|   |   
|   \---com
|       \---csayer
|           \---MotorSystem
|                   FTCMain.class
|                   Motor.class
|                   MotorSystem.class
|                   
\---src             Source code
    \---com
        \---csayer
            \---MotorSystem
                    FTCMain.java
                    Motor.java
                    MotorSystem.java
          