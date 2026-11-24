package com.csayer.MotorSystem;

public class Motor 
{
    public static final int MOVEMENT = 0;
    //Just gonna comment these out until i know what the basic Motor.SERVOs do.  DO NOT DELETE!
    //public static final int FLICKER = 1;
    //public static final int ROLLER = 2;
    public static final int SERVO = 3;
    public static final int IZC = 4;
    public static final int SHOOTER = 5;
    public static final int CHAIN = 6;
    public static final int GATE = 7;
    public static final int LIFT = 8;

    public final int port;
    public final int type;   //0 for basic movement Motor, 1 for flicker, and 2 for rollers/misc
    public final int hub;    //0 for expansion and 1 for control
    public final int diameter;

    public Motor(int port, int type, int hub, int diameter)
    {
        this.port = port;
        this.type = type;
        this.hub = hub;
        this.diameter = diameter;
    }
}