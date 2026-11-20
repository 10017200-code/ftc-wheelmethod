package com.csayer.Motorsystem;

public class Motor {
    //Motor data here
    int pin;
    int type;   //0 for basic movement Motor, 1 for flicker, and 2 for rollers/misc
    int diameter;
    public static int getMotor(int value)
    {
        //Here, itll be used to fetch stuff from the Motor object
    }
    public Motor makeMotor(int pin, int type, int diameter)
    {
        Motor finishedMotor = new Motor();
        finishedMotor.pin = pin;
        finishedMotor.type = type;
        finishedMotor.diameter = diameter;
        return finishedMotor;
    }
}