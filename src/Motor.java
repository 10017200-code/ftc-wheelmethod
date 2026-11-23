package com.csayer.MotorSystem;

public class Motor 
{
    //Motor data here
    int pin;
    int type;   //0 for basic movement Motor, 1 for flicker, and 2 for rollers/misc
    int diameter;
    public int getMotor(Motor mt, int value)
    {
        //Values:
        //0: get pin
        //1: get type
        //2: get diameter
        return switch (value) {
            case 0 -> mt.pin;
            case 1 -> mt.type;
            case 2 -> mt.diameter;
            default -> -1;
        };
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