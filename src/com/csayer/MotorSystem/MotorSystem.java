package com.csayer.MotorSystem;

public class MotorSystem
{
    public void runWheels(Motor fl, Motor fr, Motor bl, Motor br, int speed, int dir)
    {
        System.out.printf("[DBG] Direction:%d Speed%d", dir, speed);
        System.out.printf("[DBG] WheelPins:\n%d\n%d\n%d\n%d\n", fl.pin, fr.pin, bl.pin, br.pin);
    }
    public void runMotor(Motor motor, int speed, int duration, int dir)
    {
        //Here, it should do the basic execution of moving a Motor at `pin` 
        //at `speed` which is rpm for `time` milliseconds. dir is either 0 or 1, 1 is fw, you get it.
        System.out.printf("[DBG] Duration:%d Speed:%d Pin:%d\n", speed, duration, motor.pin);
    }

    public void turnWheels(Motor fl, Motor fr, Motor bl, Motor br, int speed, int angle)
    {
        System.out.printf("[DBG] Angle:%d Speed:%d\n", angle, speed);
        System.out.printf("[DBG] WheelPins:\n%d\n%d\n%d\n%d\n", fl.pin, fr.pin, bl.pin, br.pin);
    }
}