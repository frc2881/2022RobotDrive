package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RightCatapult;

public class ResetRight extends CommandBase {
  private RightCatapult catapult;

  public ResetRight(RightCatapult catapult) {
    this.catapult = catapult;
    addRequirements(catapult);
  }

  @Override
  public void execute() {
    catapult.run(-0.1);
  }

  @Override
  public void end(boolean interrupted) {
    catapult.run(0.0);
  }

  @Override
  public boolean isFinished() {
    return catapult.reachedLowerSoftLimit();
  }
}
