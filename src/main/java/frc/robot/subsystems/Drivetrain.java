package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Subsystem;
import com.revrobotics.CANSparkMax;
import com.kauailabs.navx.frc.AHRS;
public class Drivetrain implements Subsystem {
    CANSparkMax l1, l2, r1, r2;
    AHRS gyro;

    public Drivetrain(
        CANSparkMax l1,
        CANSparkMax l2,
        CANSparkMax r1,
        CANSparkMax r2,
        AHRS gyro

    ) {
        this.l1 = l1;
        this.l2 = l2;
        this.r1 = r1;
        this.r2 = r2;
        this.gyro = gyro;

        l2.follow(l1);
        r2.follow(r1);
    }

    public void arcadeDrive(double throttle, double wheel) {
        l1.set(throttle + wheel);
        r1.set(throttle - wheel);
    }
}
