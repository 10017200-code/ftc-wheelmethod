package com.csayer.MotorSystem;

public class MotorSystem
{
    public static void main(String[] args)
    {
        System.out.println("This is only a function. Import this class inside of another class to use it.");
    }
    public void runMotor(Motor motor, int speed, int duration)
    {
        //Here, it should do the basic execution of moving a Motor at `pin` 
        //at `speed` which is rpm for `time` miliseconds.
        System.out.printf("DBG: %d %d %d\n", speed, duration, motor.pin);
    }
}