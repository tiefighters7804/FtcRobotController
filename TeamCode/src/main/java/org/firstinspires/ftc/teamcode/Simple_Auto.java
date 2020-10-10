package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Simple_Auto", group = "Ultimate_Goal;")
public class Simple_Auto extends OpMode {

    DcMotor lf, rf, lr, rr;

    @Override
    public void init()
    {
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
        if(!lf.isBusy() || !rf.isBusy() || !lr.isBusy())
        {

        }
        lf.setTargetPosition(1000);
        rf.setTargetPosition(1000);
        lr.setTargetPosition(1000);
    //    rr.setTargetPosition(1000);
        lf.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rf.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        lr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       // rr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        lf.setPower(0.75);
        rf.setPower(0.75);
        lr.setPower(0.75);
      //  rr.setPower(0.75);
        stop();
    }
    @Override
    public void stop()
    {
        rr.setPower(0.25);
    }
}
