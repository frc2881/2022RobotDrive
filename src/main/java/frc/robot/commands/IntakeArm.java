package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Intake.State;

public class IntakeArm extends CommandBase {
  private Intake intake;
  private State state;

  /** Creates a new Intake_Arm. */
  public IntakeArm(Intake intake, State state) {
    this.intake = intake;
    this.state = state;
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(state == State.EXTEND) {
      intake.extend();
    } else {
      intake.retract();
    }
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
