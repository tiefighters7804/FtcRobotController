package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Odometry_Test", group = "Ultimate_Goal;")
public class Odometry_Test extends OpMode {

    DcMotor lf, rf, lr, rr;

    @Override
    public void init()
    {
        lf = hardwareMap.dcMotor.get("lf");
        lf = hardwareMap.dcMotor.get("lf");
        rf = hardwareMap.dcMotor.get("rf");
        lr = hardwareMap.dcMotor.get("lr");
        rr = hardwareMap.dcMotor.get("rr");
        lf.setDirection(DcMotorSimple.Direction.REVERSE);
        lr.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop()
    {

    }
    @Override
    public void stop()
    {

    }
}
