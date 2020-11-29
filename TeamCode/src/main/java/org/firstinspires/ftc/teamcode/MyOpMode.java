package org.firstinspires.ftc.teamcode;

import java.util.ArrayList;

public class MyOpMode {

    @Override
    public void init{}
    {

    }

    @Override
    public void loop{}
    {
        ArrayList<CurvePoint> allPoints = new ArrayList<>();
        allPoints.add(new CurvePoint(0,0, 1.0, 1.0, 50, Math.toRadians(50), 1.0));
        allPoints.add(new CurvePoint(1000,, 1.0, 1.0, 50, Math.toRadians(50), 1.0));
    }
}
