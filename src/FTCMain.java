package com.csayer.MotorSystem;

public class FTCMain
{
    public static void main(String[] args)
    {   
        MotorSystem mSys = new MotorSystem();
        Motor baseMotor = new Motor();

        //[f, b][Left, Right]
        //Front Motors
        Motor fLeft = baseMotor.makeMotor(1, 0, 10); 
        Motor fRight = baseMotor.makeMotor(2, 0, 10);

        //Back Motors
        Motor bLeft = baseMotor.makeMotor(3, 0, 10);
        Motor bRight = baseMotor.makeMotor(4, 0, 10);

        //Flicker
        Motor flicker1 = baseMotor.makeMotor(10, 1, 6);
        Motor flicker2 = baseMotor.makeMotor(11, 1, 6);

        //Rollers
        Motor roller1 = baseMotor.makeMotor(20, 2, 3);
        Motor roller2 = baseMotor.makeMotor(21, 2, 3);
        Motor roller3 = baseMotor.makeMotor(22, 2, 3);

        //                    //
        //      Examples      //
        //                    //
        
        //1: Fetching info from a Motor object
        System.out.printf("The pin for the front left wheel is %s\n", fLeft.getMotor(fLeft, 0));
        System.out.printf("The pin for the front right wheel is %s\n", fLeft.getMotor(fRight, 0));
        System.out.printf("The pin for the back left wheel is %s\n", fLeft.getMotor(bLeft, 0));
        System.out.printf("The pin for the back right wheel is %s\n", fLeft.getMotor(bRight, 0));
    }
}