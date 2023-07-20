// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;


/** Add your docs here. */
public class driveTrain extends TimedRobot{


    @Override
    public void robotInit() {
      // We need to invert one side of the drivetrain so that positive voltages
      // result in both sides moving forward. Depending on how your robot's
      // gearbox is constructed, you might have to invert the left side instead.
    
      if(Constants.controller.getRawAxis(1) > 0){
        Constants.leftMotors.set(1);
        Constants.rightMotors.set(1);

    } else if(Constants.controller.getRawAxis(1) < 0){
        Constants.leftMotors.set(-1);
        Constants.rightMotors.set(-1);

    } else{
        Constants.leftMotors.stopMotor();
        Constants.rightMotors.stopMotor();
    }

    }
  
    @Override
    public void teleopPeriodic() {
 
}
}