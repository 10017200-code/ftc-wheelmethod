package com.csayer.MotorSystem;

public class Motor 
{
    public static final int BASIC = 0;
    public static final int FLICKER = 1;
    public static final int ROLLER = 2;
    public final int pin;
    public final int type;   //0 for basic movement Motor, 1 for flicker, and 2 for rollers/misc
    public final int diameter;
    public Motor(int pin, int type, int diameter)
    {
        this.pin = pin;
        this.type = type;
        this.diameter = diameter;
    }
}