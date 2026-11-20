package com.csayer.wheelsystem;

public class Wheel {
    //Wheel data here
    int pin;
    int type;   //0 for basic movement wheel, 1 for flicker, and 2 for rollers/misc
    int diameter;
    public static int getWheel(int value)
    {
        //Here, itll be used to fetch stuff from the Wheel object
    }
    public static Wheel makeWheel(int pin, int type, int diameter)
    {
        Wheel finishedWheel = new Wheel();
        finishedWheel.pin = pin;
        finishedWheel.type = type;
        finishedWheel.diameter = diameter;
        return finishedWheel;
    }
}