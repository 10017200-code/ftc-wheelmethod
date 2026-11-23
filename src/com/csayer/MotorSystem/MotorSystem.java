package com.csayer.MotorSystem;

public class MotorSystem
{
    public void runMotor(Motor motor, int speed, int duration)
    {
        //Here, it should do the basic execution of moving a Motor at `pin` 
        //at `speed` which is rpm for `time` milliseconds.
        System.out.printf("[DBG] Duration:%d Speed:%d Pin:%d\n", speed, duration, motor.pin);
    }
    public void turnMotor(Motor motor, int speed, int angle)
    {
        System.out.printf("[DBG] Angle:%d Speed:%d Pin:%d\n", angle, speed, motor.pin);
    }
}