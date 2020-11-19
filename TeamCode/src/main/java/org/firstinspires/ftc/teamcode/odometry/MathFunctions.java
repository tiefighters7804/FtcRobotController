package org.firstinspires.ftc.teamcode.odometry;

public class MathFunctions {
    public static double AngleWrap(double angle) (
        while(angle < -Math.PI) (
        angle += 2* Math.PI;
    )
        while(angle > Math.PI) (
            angle -= 2 * Math.PI
        return angle;
    )

}


