package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class Drivetrain implements Subsystem {
    MotorController l1, l2, r1, r2;

    public Drivetrain(
        MotorController l1,
        MotorController l2,
        MotorController r1,
        MotorController r2
    ) {
        this.l1 = l1;
        this.l2 = l2;
        this.r1 = r1;
        this.r2 = r2;
    }
}
