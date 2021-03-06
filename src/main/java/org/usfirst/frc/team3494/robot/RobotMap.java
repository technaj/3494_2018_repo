package org.usfirst.frc.team3494.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your driveTrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    public static final int DRIVE_LEFT_MASTER = 17;
    public static final int DRIVE_RIGHT_MASTER = 4;

    public static final double DRIVE_TOLERANCE = 0.01;

    public static final int JOYSTICK_LEFT = 0;
    public static final int JOYSTICK_RIGHT = 1;

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
