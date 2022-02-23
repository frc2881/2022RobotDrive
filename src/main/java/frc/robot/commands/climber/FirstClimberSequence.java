// Copyright (c) 2022 FRC Team 2881 - The Lady Cans
//
// Open Source Software; you can modify and/or share it under the terms of BSD
// license file in the root directory of this project.

package frc.robot.commands.climber;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Climber;
import frc.robot.utils.NavX;

/** Add your docs here. */
public class FirstClimberSequence extends SequentialCommandGroup {
  public FirstClimberSequence(Climber climber, NavX navx) {
    addCommands(
        new ArmToLength(climber, -1.0, 5.0),
        new ArmToLength(climber, -0.4, 0.0),
        new WaitCommand(.5),
        new ArmToLength(climber, 1.0, 5.0),
        new ArmBack(climber),
        //new ArmWaitToExtend(navx),
        new ArmToLength(climber, 1.0, 25.5),
        new ArmUp(climber)
    );
  }
}
