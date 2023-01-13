package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.Subsystem;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Subsystem;
import com.revrobotics.CANSparkMax;
import com.kauailabs.navx.frc.AHRS;
public class Drivetrain implements Subsystem {
    CANSparkMax l1, l2;
    CANSparkMax r1, r2;
    AHRS gyro;
    l1 = new CANSparkMax(0);
    l2 = new CANSparkMax(1);
    r1 = new CANSparkMax(2);
    r2 = new CANSparkMax(3);

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

        r1.setInverted(true);
        r2.setInverted(true);
        l2.follow(l1);
        r2.follow(r1);
    }

    public static void main(String... args) {

    }

    public void method() {
        System.out.println("blah");
    }

    public void arcadeDrive(double throttle, double wheel) {
        l1.set(ControlMode.PercentOutput, throttle + wheel);
        r1.set(ControlMode.PercentOutput, throttle - wheel);
    }
    @Override
    public void close() {
        l1.close();
        l2.close();
        r1.close();
        r2.close();
    }
}
