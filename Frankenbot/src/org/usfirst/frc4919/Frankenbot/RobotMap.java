// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Frankenbot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveSystemSpeedController1;
    public static SpeedController driveSystemSpeedController2;
    public static SpeedController driveSystemSpeedController3;
    public static SpeedController driveSystemSpeedController4;
    public static MecanumDrive driveSystemMecanumDrive1;
    public static Compressor pneumaticArmCompressor1;
    public static DoubleSolenoid pneumaticArmDoubleSolenoid1;
    public static Servo liftWinchLift;
    public static DoubleSolenoid pneumaticClampDoubleSolenoid1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSystemSpeedController1 = new VictorSP(1);
        LiveWindow.addActuator("DriveSystem", "Speed Controller 1", (VictorSP) driveSystemSpeedController1);
        driveSystemSpeedController1.setInverted(false);
        driveSystemSpeedController2 = new VictorSP(2);
        LiveWindow.addActuator("DriveSystem", "Speed Controller 2", (VictorSP) driveSystemSpeedController2);
        driveSystemSpeedController2.setInverted(false);
        driveSystemSpeedController3 = new VictorSP(3);
        LiveWindow.addActuator("DriveSystem", "Speed Controller 3", (VictorSP) driveSystemSpeedController3);
        driveSystemSpeedController3.setInverted(false);
        driveSystemSpeedController4 = new VictorSP(4);
        LiveWindow.addActuator("DriveSystem", "Speed Controller 4", (VictorSP) driveSystemSpeedController4);
        driveSystemSpeedController4.setInverted(false);
        driveSystemMecanumDrive1 = new MecanumDrive(driveSystemSpeedController1, driveSystemSpeedController2,
              driveSystemSpeedController3, driveSystemSpeedController4);
        LiveWindow.addActuator("DriveSystem", "Mecanum Drive 1", driveSystemMecanumDrive1);
        driveSystemMecanumDrive1.setSafetyEnabled(true);
        driveSystemMecanumDrive1.setExpiration(0.1);
        driveSystemMecanumDrive1.setMaxOutput(1.0);

        pneumaticArmCompressor1 = new Compressor(0);
        LiveWindow.addActuator("PneumaticArm", "Compressor 1", pneumaticArmCompressor1);
        
        pneumaticArmDoubleSolenoid1 = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("PneumaticArm", "Double Solenoid 1", pneumaticArmDoubleSolenoid1);
        
        liftWinchLift = new Servo(0);
        LiveWindow.addActuator("LiftWinch", "Lift", liftWinchLift);
        
        pneumaticClampDoubleSolenoid1 = new DoubleSolenoid(0, 2, 3);
        LiveWindow.addActuator("PneumaticClamp", "Double Solenoid 1", pneumaticClampDoubleSolenoid1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
