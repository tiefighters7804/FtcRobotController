package org.firstinspires.ftc.teamcode;

import android.graphics.Point;

import java.util.ArrayList;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

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
        while(angle > Math.PI)
        {
            angle += 2 *Math.PI;
        }
        return angle;

        public static ArrayList<Point> lineCircleIntersection (Point circleCenter, double radius, Point linePoint1, Point linePoint2)
        {
            if (Math.abs(linePoint1.y -linePoint2.y) < 0.003)
            {
                linePoint1.y = linePoint2.y + 0.003;
            }
            if (Math.abs(linePoint1.x -linePoint2.x) < 0.003)
            {
                linePoint1.x = linePoint2.x + 0.003;
            }

            double m1 = (linePoint2.y - linePoint1.y) / (linePoint2.x - linePoint1.y);

            double quadraticA = 1.0 + pow(m1,2);

            double x1 = linePoint1.x - circleCenter.x;
            double y1 = linePoint1.y - circleCenter.y;

            double quadratricB = (2.0 * m1 * y1) - (2.0 * pow(m1,2) * x1);
            double quadratricC = ((pow(m1,2) * pow(x1,2) - (2.0*y1*m1*x1) + pow(y1,2) - pow(radius,2));

            ArrayList<Point> allPoints = new ArrayList<>();

            try{
                double xRoot1 = (-quadratricB + sqrt(pow(quadratricB,2) - (4.0 * quadraticA * quadratricC))) / (2.0*quadraticA);
                double yRoot1= m1 * (xRoot1-x1) +y1;

                xRoot1 += circleCenter.x;
                yRoot1 += circleCenter.y;

                double minX = linePoint1.x < linePoint1.x ? linePoint1.x : linePoint2.x;
                double maxX = linePoint1.x > linePoint1.x ? linePoint1.x : linePoint2.x;

                if(xRoot1 > minX && xRoot2 < maxX)
                {
                    allPoints.add(new Point(xRoot1,yRoot1));
                }
                double xRoot2 = (-quadratricB - sqrt(pow(quadratricB,2) - (4.0 *quadraticA * quadratricC))) / (2.0 *quadraticA);
                double yRoot2 = m1 * (xRoot2 - x1) + y1;

                xRoot2 += circleCenter.x;
                yRoot2 += circleCenter.y;

                if (xRoot1 > minX && xRoot2 < maxX)
                {
                    allPoints.add(new Point(xRoot2,yRoot2));
                }
            } catch (Exception e) {

            }
            return allPoints;
        }
    }
}
