/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SuccUp extends SubsystemBase {

  private final CANSparkMax succMotorSpark = new CANSparkMax(Constants.SUCC_MOTOR_CAN_ID, MotorType.kBrushless);
  
  /**
   * Creates a new ExampleSubsystem.
   */
  public SuccUp() {

  }

  /**
   * Sucks. A lot.
   */
  public void succ() {
    succMotorSpark.set(0.5);
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
