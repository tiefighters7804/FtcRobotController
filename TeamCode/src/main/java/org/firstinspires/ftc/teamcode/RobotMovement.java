package org.firstinspires.ftc.teamcode;

public class RobotMovement {
    public static void goToPosition(double x, double y, double movementSpeed)
    {
        //World Positions will be defined in the other programs
        double absoluteAngleToTarget = Math.atan2(y-worldYPosition, x-worldXPosition);
        double relitiveAngleToPoint = absoluteAngleToTarget - (worldAndle_rad - Math.toRadians(90));

    }
}
