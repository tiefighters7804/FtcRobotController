package org.firstinspires.ftc.teamcode.odometry;

import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.teamcode.odometry.Point;
import static org.firstinspires.ftc.teamcode.odometry.MovementVars.movement_x;
import static org.firstinspires.ftc.teamcode.odometry.MovementVars.movement_y;
import static org.firstinspires.ftc.teamcode.odometry.MovementVars.movement_turn;
import static org.firstinspires.ftc.teamcode.odometry.OdometryGlobalCoordinatePosition.robotGlobalXCoordinatePositon;
import static org.firstinspires.ftc.teamcode.odometry.OdometryGlobalCoordinatePosition.robotGlobalYCoordinatePosition;
import static org.firstinspires.ftc.teamcode.odometry.OdometryGlobalCoordinatePosition.robotOrientationRadians;
import static


public class PurePursuit {
    /**
     *
     * @param x
     * @param y
     * @param movementSpeed
     */
    public static void goToPosition(double x, double y, double movementSpeed, double preferredAngle, double turnSpeed)

        double distanceToTarget = Math.hypot(x-worldXPosition, y - worldYPosition);
        double absoluteAngleToTarget = Math.atan2(y-worldYpostition,xworldXposition);
        double relavivetiAngleToPoint = AngleWrap(absoluteAngleToTarget -(worldAngle_rad - Math.toRadians(90)));



        double relativeXToPoint = Math.cos(relativeAngleToPoint) * distanceToTarget;
        double relativeYToPoint = Math.sin(relativeAngleToPoint) * distanceToTarget;
        double movementXPower = relativeXToPoint /  (Math.abs (relativeXToPoint) + Math.abs (relativeYToPoint) );
        double movementYPower = relativeYToPoint /   (Math.abs (relativeXToPoint) + Math.abs (relativeYToPoint);

        movement_x = movementXPower * movementSpeed;
        movement_y = movementYPower  * movementSpeed;

        double relativeTurnAngle = relavivetiAngleToPoint - Math.toRadians(180) + preferredAngle;

        movement_turn = Range.clip(relativeTurnAngle/Math.toRadians(30), min -1, max1) * turnSpeed
