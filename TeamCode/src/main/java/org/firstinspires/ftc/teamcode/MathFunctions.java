package org.firstinspires.ftc.teamcode;

public class MathFunctions {
    /**
     * @param angle
     * @return
     */
    public static double AngleWrap(double angle)
    {
        while(angle < -Math.PI)
        {
            angle += 2 *Math.PI;
        }
        return angle;
    }
}
