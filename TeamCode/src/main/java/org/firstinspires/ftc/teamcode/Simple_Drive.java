package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "Simple_Drive", group = "Ultimate_Goal;")
public class Simple_Drive extends OpMode {


    DcMotor lf, rf, lr, rr;
    double V;
    float H;
    float P;

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
    public void loop() {
        V = gamepad1.left_stick_y;
        H = gamepad1.left_stick_x;
        P = - gamepad1.right_stick_x;
        lf.setPower(P + V - H);
        rf.setPower(-P + (V + H));
        lr.setPower(P + (V + H));
        rr.setPower(-P + V - H);
    }
    @Override
    public void stop()
    {

    }
}
