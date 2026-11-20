package com.csayer.MotorSystem;

public class Motor 
{
    //Motor data here
    int pin;
    int type;   //0 for basic movement Motor, 1 for flicker, and 2 for rollers/misc
    int diameter;
    public static int getMotor(Motor motor, int value)
    {
        //Values:
        //0: get pin
        //1: get type
        //2: get diameter
        switch(value)
        {
            case 0:
                return motor.pin;
                break;

            case 1:
                return motor.type;
                break;

            case 2:
                return motor.diameter;
                break;

            default:
                break;
        }
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