/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//This one makes the thing go vroom.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {

  private final CANSparkMax driveMotorSparkFL = new CANSparkMax(Constants.DRIVEFL_MOTOR_CAN_ID, MotorType.kBrushless);
  private final CANSparkMax driveMotorSparkFR = new CANSparkMax(Constants.DRIVEFR_MOTOR_CAN_ID, MotorType.kBrushless);
  private final CANSparkMax driveMotorSparkBL = new CANSparkMax(Constants.DRIVEBL_MOTOR_CAN_ID, MotorType.kBrushless);
  private final CANSparkMax driveMotorSparkBR = new CANSparkMax(Constants.DRIVEBR_MOTOR_CAN_ID, MotorType.kBrushless);

  private final MecanumDrive drivetrain = new MecanumDrive(driveMotorSparkFL, driveMotorSparkFR, driveMotorSparkBL, driveMotorSparkBR);

  /**
   * Creates a new ExampleSubsystem.
   */
  public DriveTrain() {
  }

  
  public void drive(double x, double y, double twist) {
    driveMotorSparkFL.set(0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
