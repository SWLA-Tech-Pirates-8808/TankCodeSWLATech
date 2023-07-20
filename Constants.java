// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj.XboxController;


/** Add your docs here. */
public class Constants {

    public static final XboxController controller = new XboxController(0);
  
    public static final VictorSP leftMotors = new VictorSP(0);
    public static final VictorSP rightMotors = new VictorSP(1);

   
}
