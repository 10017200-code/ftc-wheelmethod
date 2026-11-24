package com.csayer.MotorSystem;

public class FTCMain
{
    public static void main(String[] args)
    {
        //Expansion hub
        //Movement
        Motor fLeft = new Motor(2, Motor.BASIC, 0, 10);
        Motor fRight = new Motor(3, Motor.BASIC, 0, 10);
        Motor bLeft = new Motor(0, Motor.BASIC, 0, 10);
        Motor bRight = new Motor(1, Motor.BASIC, 0, 10);

        //Servos
        Motor servo1 = new Motor(0, Motor.SERVO, 0, 10);
        Motor servo2 = new Motor(1, Motor.SERVO, 0, 10);
        Motor polGate = new Motor(2, Motor.SERVO, 0, 10);
        Motor ntsGate = new Motor(3, Motor.SERVO, 0, 10);
        Motor rmpLift = new Motor(4, Motor.SERVO, 0, 10);
        Motor intLift = new Motor(5, Motor.SERVO, 0, 10);

        //Control Hub
        //Motors
        Motor intChain = new Motor(0, Motor.BASIC, 1, 10);
        Motor nctShooter = new Motor(1, Motor.BASIC, 1, 10);
        Motor plnShooter = new Motor(2, Motor.BASIC, 1, 10);
        Motor rmpWhlChain = new Motor(3, Motor.BASIC, 1, 10);

        //Servos
        Motor nctShooterGate = new Motor(0, Motor.SERVO, 1, 10);
        Motor motor1 = new Motor(1, Motor.SERVO, 1, 10);
        Motor plnShootergGate = new Motor(2, Motor.SERVO, 1, 10);
        Motor motor2 = new Motor(3, Motor.SERVO, 1, 10);
        Motor motor3 = new Motor(4, Motor.SERVO, 1, 10);
        Motor motor4 = new Motor(5, Motor.SERVO, 1, 10);

        //IZCs
        Motor izc1 = new Motor(0, Motor.IZC, 1, 10);
        Motor odomtrypPinPointComputer = new Motor(1, Motor.IZC, 1, 10);
        Motor izc2 = new Motor(2, Motor.IZC, 1, 10);
        Motor izc3 = new Motor(3, Motor.IZC, 1, 10);
        //Continue
        //                    //
        //      Examples      //
        //                    //
        
        //1: Fetching info from a Motor object
        System.out.printf("[MainClass] The port for the front left wheel is %s\n", fLeft.port);
        System.out.printf("[MainClass] The port for the front right wheel is %s\n", fRight.port);
        System.out.printf("[MainClass] The port for the back left wheel is %s\n", bLeft.port);
        System.out.printf("[MainClass] The port for the back right wheel is %s\n", bRight.port);

        //2: Running the movement wheels
        //Runs ALL movement wheels at 50 rpm for 1 second going forwards
        MotorSystem.runWheels(fLeft, fRight, bLeft, bRight, 50, 1000, 1);

        //3: Running a motor
        //Runs one motor (here the front left wheel) for 1 second going forwards
        MotorSystem.runMotor(fLeft, 60, 1000, 1);

        //4: Turning the movement wheels
        //Turns ALL movement wheels at a 90-degree angle at 50 rpm for 1 second
        MotorSystem.turnWheels(fLeft, fRight, bLeft, bRight, 50, 90, 1000);
    }
}