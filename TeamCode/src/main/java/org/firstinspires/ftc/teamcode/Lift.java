package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Lift {
    private Telemetry telemetry=null;
    private DcMotor liftMotor=null;

    public Lift(Telemetry telemetry, DcMotor liftMotor) {
        this.telemetry = telemetry;
        this.liftMotor = liftMotor;
        this.liftMotor.setDirection(DcMotor.Direction.REVERSE);
//        this.liftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        this.liftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        this.liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }

    public void setPower(double power) {
        int cp = liftMotor.getCurrentPosition();
        double sp = squareIt(power)/2;
        telemetry.addData("Set Lift Power", "%4.2f",sp );
        telemetry.addData("Lift Motor Pos", "%7d",cp );
        liftMotor.setPower(sp);
    }


    public double squareIt(double input) {
        double sign = Math.signum(input);
        if (sign > 0) {
            return input * input;
        } else {
            return -(input * input);
        }
    }


    public void stop() {
        liftMotor.setPower(0);
    }
}
