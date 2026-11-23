package com.csayer.MotorSystem;

public class MotorSystem
{
    public void runWheels(Motor fl, Motor fr, Motor bl, Motor br, int speed, int duration, int dir)
    {
        System.out.printf("[DBG] Direction:%d Speed%d Duration:%d", dir, speed, duration);
        System.out.printf("[DBG] WheelPins:\n%d\n%d\n%d\n%d\n", fl.pin, fr.pin, bl.pin, br.pin);
    }
    public void runMotor(Motor motor, int speed, int duration, int dir)
    {
        //Here, it should do the basic execution of moving a Motor at `pin` 
        //at `speed` which is rpm for `time` milliseconds. dir is either 0 or 1, 1 is fw, you get it.
        System.out.printf("[DBG] Duration:%d Speed:%d Pin:%d Dir:%dd\n", speed, duration, motor.pin, dir);
    }

    public void turnWheels(Motor fl, Motor fr, Motor bl, Motor br, int speed, int angle, int duration)
    {
        System.out.printf("[DBG] Angle:%d Speed:%d Duration:%d\n", angle, speed, duration);
        System.out.printf("[DBG] WheelPins:\n%d\n%d\n%d\n%d\n", fl.pin, fr.pin, bl.pin, br.pin);
    }
}