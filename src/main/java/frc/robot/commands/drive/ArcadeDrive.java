// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.drive;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class ArcadeDrive extends CommandBase {
  Drivetrain drive;
  DoubleSupplier throttle, wheel;

  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(Drivetrain drive, DoubleSupplier throttle, DoubleSupplier wheel) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drive = drive;
    this.throttle = throttle;
    this.wheel = wheel;
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive.arcadeDrive(throttle.getAsDouble(), wheel.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
