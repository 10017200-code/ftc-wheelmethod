package com.csayer.MotorSystem;

public class FTCMain
{
    public static void main(String[] args)
    {
        //Unnamed motors will just have generic names and types (Not types like int and String, the 2nd argument for Motor();
        //Nor 100% sure this will translate well.
        //Competition only a few days away!!!!!!!!

        //Expected controls:
        //Left stick: Movement, could just make it a fancy D-Pad internally but that's probably not what's gonna happen
        //Right stick: Rotation, MotorSystem.turnWheels();
        //Right trigger: Shoot (aka open gates)
        //Right bumper: Intake and magazine
        //Left bumper: magazine
        //D-Pad Up: raise intake
        //D-Pad Down: lower intake


        //Expansion hub
        //Movement
        Motor fLeft = new Motor(2, Motor.MOVEMENT, 0, 10);
        Motor fRight = new Motor(3, Motor.MOVEMENT, 0, 10);
        Motor bLeft = new Motor(0, Motor.MOVEMENT, 0, 10);
        Motor bRight = new Motor(1, Motor.MOVEMENT, 0, 10);

        //Servos
        Motor servo1 = new Motor(0, Motor.SERVO, 0, 10);
        Motor servo2 = new Motor(1, Motor.SERVO, 0, 10);
        Motor polGate = new Motor(2, Motor.GATE, 0, 10);
        Motor ntsGate = new Motor(3, Motor.GATE, 0, 10);
        Motor rmpLift = new Motor(4, Motor.LIFT, 0, 10);
        Motor intLift = new Motor(5, Motor.LIFT, 0, 10);

        //Control Hub
        //Motors
        Motor intChain = new Motor(0, Motor.CHAIN, 1, 10);
        Motor nctShooter = new Motor(1, Motor.SHOOTER, 1, 10);
        Motor plnShooter = new Motor(2, Motor.SHOOTER, 1, 10);
        Motor rmpWhlChain = new Motor(3, Motor.CHAIN, 1, 10);

        //Servos
        Motor nctShooterGate = new Motor(0, Motor.GATE, 1, 10);
        Motor motor1 = new Motor(1, Motor.SERVO, 1, 10);
        Motor plnShooterGate = new Motor(2, Motor.GATE, 1, 10);
        Motor motor2 = new Motor(3, Motor.SERVO, 1, 10);
        Motor motor3 = new Motor(4, Motor.SERVO, 1, 10);
        Motor motor4 = new Motor(5, Motor.SERVO, 1, 10);

        //IZCs
        Motor izc1 = new Motor(0, Motor.IZC, 1, 10);
        Motor odometerPinPointComputer = new Motor(1, Motor.IZC, 1, 10);
        Motor izc2 = new Motor(2, Motor.IZC, 1, 10);
        Motor izc3 = new Motor(3, Motor.IZC, 1, 10);

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