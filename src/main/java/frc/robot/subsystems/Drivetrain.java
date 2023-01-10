package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.Subsystem;
import com.kauailabs.navx.frc.AHRS;

public class Drivetrain implements Subsystem {
    VictorSPX l1, l2;
    TalonSRX r1, r2;
    AHRS gyro;

    public Drivetrain(
        VictorSPX l1,
        VictorSPX l2,
        TalonSRX r1,
        TalonSRX r2,
        AHRS gyro
    ) {
        this.l1 = l1;
        this.l2 = l2;
        this.r1 = r1;
        this.r2 = r2;
        this.gyro = gyro;

        r1.setInverted(true);
        r2.setInverted(true);
        l2.follow(l1);
        r2.follow(r1);
    }

    public void arcadeDrive(double throttle, double wheel) {
        l1.set(ControlMode.PercentOutput, throttle + wheel);
        r1.set(ControlMode.PercentOutput, throttle - wheel);
    }
}
