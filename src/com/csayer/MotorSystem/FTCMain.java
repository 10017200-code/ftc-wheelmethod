package com.csayer.MotorSystem;

public class FTCMain
{
    public static void main(String[] args)
    {
        //[f, b][Left, Right]
        //Front Motors
        Motor fLeft = new Motor(2, Motor.BASIC, 10);
        Motor fRight = new Motor(3, Motor.BASIC, 10);
        Motor bLeft = new Motor(0, Motor.BASIC, 10);
        Motor bRight = new Motor(1, Motor.BASIC, 10);

        //Servos
        Motor servo1 = new Motor(0, Motor.SERVO, 10);
        Motor servo2 = new Motor(1, Motor.SERVO, 10);
        Motor polGate = new Motor(2, Motor.SERVO, 10);
        Motor ntsGate = new Motor(3, Motor.SERVO, 10);
        Motor rmpLift = new Motor(4, Motor.SERVO, 10);
        Motor intLift = new Motor(5, Motor.SERVO, 10);

        //Control Hub
        //Motors
        //TODO:
        //Use paper to update this, and make sure the names dont cause errors!
        //And, fix the 4 errors obviously
        Motor intChain = new Motor(0, Motor.BASIC, 10);
        Motor nctShooter = new Motor(1, Motor.BASIC, 10);
        //Continue...

        //Flicker
        Motor flicker1 = new Motor(10, Motor.FLICKER, 10);
        Motor flicker2 = new Motor(11, Motor.FLICKER, 6);

        //Rollers
        Motor roller1 = new Motor(20, Motor.ROLLER, 3);
        Motor roller2 = new Motor(21, Motor.ROLLER, 3);
        Motor roller3 = new Motor(22, Motor.ROLLER, 3);
        Motor roller4 = new Motor(23, Motor.ROLLER, 3);
        Motor roller5 = new Motor(24, Motor.ROLLER, 3);
        Motor roller6 = new Motor(25, Motor.ROLLER, 3);

        //                    //
        //      Examples      //
        //                    //
        
        //1: Fetching info from a Motor object
        System.out.printf("[MainClass] The pin for the front left wheel is %s\n", fLeft.pin);
        System.out.printf("[MainClass] The pin for the front right wheel is %s\n", fRight.pin);
        System.out.printf("[MainClass] The pin for the back left wheel is %s\n", bLeft.pin);
        System.out.printf("[MainClass] The pin for the back right wheel is %s\n", bRight.pin);

        //2: Running the movement wheels
        //Runs ALL movement wheels at 50 rpm for 1 second going forwards
        MotorSystem.runWheels(fLeft, fRight, bLeft, bRight, 50, 1000, 1);

        //3: Running a motor
        //Runs one motor (here the flicker) for 1 second going forwards
        MotorSystem.runMotor(flicker1, 60, 1000, 1);

        //4: Turning the movement wheels
        //Turns ALL movement wheels at a 90-degree angle at 50 rpm for 1 second
        MotorSystem.turnWheels(fLeft, fRight, bLeft, bRight, 50, 90, 1000);
    }
}