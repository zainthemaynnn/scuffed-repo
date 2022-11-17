package frc.robot.commands.drive;

import java.util.Set;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.Drivetrain;

public class ArcadeDrive implements Command {
    Drivetrain drive;

    public ArcadeDrive(Drivetrain drive) {
        this.drive = drive;
    }

    @Override
    public Set<Subsystem> getRequirements() {
        return Set.of(drive);
    }

    
}
