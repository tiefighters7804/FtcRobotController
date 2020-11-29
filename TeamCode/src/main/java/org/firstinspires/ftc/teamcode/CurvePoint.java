package org.firstinspires.ftc.teamcode;

import android.graphics.Point;

public class CurvePoint {
    public double x;
    public double y;
    public double moveSpeed;
    public double turnSpeed;
    public double followDistance;
    public double pointLength;
    public double slowDownTurnRadius;
    public double slowDownTurnAmount;

    public CurvePoint(double x, double y, double moveSpeed, double turnSpeed, double followDistance, double slowDownTurnRadius, double slowDownTurnAmount)
    {
        this.x = x;
        this.y = y;
        this.moveSpeed = moveSpeed;
        this.turnSpeed = turnSpeed;
        this.followDistance = followDistance;
        this.slowDownTurnRadius = slowDownTurnRadius;
        this.slowDownTurnAmount = slowDownTurnAmount;
    }
    public CurvePoint(CurvePoint thisPoint)
    {
        x = thisPoint.x;
        y = thisPoint.y;
        moveSpeed = thisPoint.moveSpeed;
        turnSpeed = thisPoint.turnSpeed;
        followDistance = thisPoint.followDistance;
        slowDownTurnRadius = thisPoint.slowDownTurnRadius;
        slowDownTurnAmount = thisPoint.slowDownTurnAmount;
        pointLength = thisPoint.pointLength;
    }

    public Point toPoint()
    {
        return new Point(x, y);
    }

    public void setPoint(Point thisIntersection) {
        x = point.x;
        y = point.y;
    }
}
