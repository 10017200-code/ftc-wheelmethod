package com.csayer.MotorSystem;

public class MotorSystem
{
    public static void runWheels(Motor fl, Motor fr, Motor bl, Motor br, int speed, int duration, int dir)
    {
        System.out.printf("[MotorSystem][runWheels][DBG] Direction:%d Speed:%d Duration:%d\n", dir, speed, duration);
        System.out.printf("[MotorSystem][runWheels][DBG] WheelPins:\nFL: %d FR: %d\nBL: %d BR: %d", fl.pin, fr.pin, bl.pin, br.pin);
    }
    public static void runMotor(Motor motor, int speed, int duration, int dir)
    {
        //Here, it should do the basic execution of moving a Motor at `pin` 
        //at `speed` which is rpm for `time` milliseconds. dir is either 0 or 1, 1 is fw, you get it.
        System.out.printf("[MotorSystem][runMotor][DBG] Duration:%d Speed:%d Pin:%d Dir:%dd\n", duration, speed, motor.pin, dir);
    }

    public static void turnWheels(Motor fl, Motor fr, Motor bl, Motor br, int speed, int angle, int duration)
    {
        System.out.printf("[MotorSystem][turnWheels][DBG] Angle:%d Speed:%d Duration:%d\n", angle, speed, duration);
        System.out.printf("[MotorSystem][turnWheels][DBG] WheelPins:\nFL: %d FR: %d\nBL: %d BR: %d", fl.pin, fr.pin, bl.pin, br.pin);
    }
}