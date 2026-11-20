package com.csayer.Motorsystem;

public class FTCMain
{
    public static void main(String[] args)
    {   
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

        Motor roller1 = baseMotor.makeMotor(20, 2, 3);
        Motor roller2 = baseMotor.makeMotor(21, 2, 3);
        Motor roller3 = baseMotor.makeMotor(22, 2, 3);
    }
}