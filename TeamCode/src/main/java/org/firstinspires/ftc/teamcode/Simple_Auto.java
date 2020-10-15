package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name = "Simple_Auto", group = "Ultimate_Goal;")
public class Simple_Auto extends OpMode {

    DcMotor lf, rf, lr, rr;
    boolean Run = false;

    @Override
    public void init()
    {
        lf = hardwareMap.dcMotor.get("lf");
        rf = hardwareMap.dcMotor.get("rf");
        lr = hardwareMap.dcMotor.get("lr");
        rr = hardwareMap.dcMotor.get("rr");
        rf.setDirection(DcMotorSimple.Direction.REVERSE);
        rr.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop()
    {
        if(!Run)
        {
            Run_Once();
            Run = true;
        }
    }
    void Run_Once()
    {
        lf.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rf.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        lr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        lf.setTargetPosition(1000);
        rf.setTargetPosition(1000);
        lr.setTargetPosition(1000);
        rr.setTargetPosition(1000);
        lf.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rf.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        lr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        lf.setPower(0.75);
        rf.setPower(0.75);
        lr.setPower(0.75);
        rr.setPower(0.75);
        if(!lf.isBusy() || !rf.isBusy() || !lr.isBusy() || !rr.isBusy())
        {

        }
        //strafe
        lf.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rf.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        lr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        lf.setTargetPosition(-1000);
        rf.setTargetPosition(1000);
        lr.setTargetPosition(1000);
        rr.setTargetPosition(-1000);
        lf.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rf.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        lr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        lf.setPower(0.5);
        rf.setPower(0.5);
        lr.setPower(0.5);
        rr.setPower(0.5);
        if(!lf.isBusy() || !rf.isBusy() || !lr.isBusy() || !rr.isBusy())
        {

        }
    }
    @Override
    public void stop()
    {

    }
}
