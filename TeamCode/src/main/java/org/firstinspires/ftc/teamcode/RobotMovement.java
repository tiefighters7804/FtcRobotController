package org.firstinspires.ftc.teamcode;

import android.graphics.Point;

import com.qualcomm.robotcore.util.Range;

import java.util.ArrayList;
import static Odometry.OdometryGlobalCoordinatePosition.robotGlobalXCoordinatePosition;
import static Odometry.OdometryGlobalCoordinatePosition.robotGlobalYCoordinatePosition;
import static Odometry.OdometryGlobalCoordinatePosition.robotOrientationRadians;
import static Odometry.OdometryGlobalCoordinatePosition.
import static org.firstinspires.ftc.teamcode.MathFunctions.lineCircleIntersection;
import static

public class RobotMovement {

    public static void followCurve(ArrayList<CurvePoint> allPoints, double followAngle)
    {
        CurvePoint followMe = getFollowPointPath(allPoints, new Point(robotGlobalXCoordinatePosition, robotGlobalYCoordinatePosition), allPoints.get(0).followDistance);
        goToPosition(followMe.x,followMe.y,followMe.moveSpeed,followAngle,followMe.turnSpeed);
    }
    public static CurvePoint getFollowPointPath(ArrayList<CurvePoint> pathPoints, Point robotLocation, double followRadius)
    {
        CurvePoint followMe = new CurvePoint((pathPoints.get(0)));
        for(int i = 0; i < pathPoints.size() - 1; i ++)
        {
            CurvePoint startLine = pathPoints.get(i);
            CurvePoint endLine = pathPoints.get(i + 1);

            ArrayList<Point> intersections = lineCircleIntersection(robotLocation, followRadius, startLine.toPoint(), endLine.toPoint());
            double closestAngle = 10000000;
            for (Point thisIntersection : intersections)
            {
                double angle = Math.atan2(thisIntersection.y - robotGlobalYCoordinatePosition - robotGlobalXCoordinatePosition);
                double deltaAngle = Math.abs(MathFunctions.AngleWrap(angle - robotOrientationRadians));

                if (deltaAngle < closestAngle)
                {
                    closestAngle = deltaAngle;
                    followMe.setPoint(thisIntersection);
                }
            }
        }
        return followMe;
    }
    /**
     *
     * @param x
     * @param y
     * @param movementSpeed
     */
    public static void goToPosition(double x, double y, double movementSpeed, double preferredAngle, double turnSpeed)
    {
        //World Positions will be defined in the other programs
        double distanceToTarget = Math.hypot(x-robotGlobalXCoordinatePosition, y-robotGlobalYCoordinatePosition);

        double absoluteAngleToTarget = Math.atan2(y-robotGlobalYCoordinatePosition, x-robotGlobalXCoordinatePosition);
        double relativeAngleToPoint = absoluteAngleToTarget - (robotOrientationRadians - Math.toRadians(90));

        double relativeXToPoint = Math.cos(relativeAngleToPoint) * distanceToTarget;
        double relativeYToPoint = Math.sin(relativeAngleToPoint) * distanceToTarget;

        double movementXPower = relativeXToPoint / (Math.abs(relativeXToPoint) + Math.abs(relativeYToPoint));
        double movementYPower = relativeYToPoint / (Math.abs(relativeXToPoint) + Math.abs(relativeYToPoint));\

         movement_x = movementXPower * movementSpeed;
         movement_y = movementYPower * movementSpeed;

        double relativeTurnAngle = relativeAngleToPoint - Math.toRadians(180) + preferredAngle;
        movement_turn = Range.clip(relativeTurnAngle/Math.toRadians(30), -1,1) * turnSpeed;

        if(distanceToTarget < 10)
        {
            movement_turn = 0;
        }
    }
}