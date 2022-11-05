package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Lift {
    private Telemetry telemetry=null;
    private DcMotor liftMotor=null;

    public Lift(Telemetry telemetry, DcMotor liftMotor) {
        this.telemetry = telemetry;
        this.liftMotor = liftMotor;
    }

    public void setPower(double power) {
        double sp = squareIt(power);
        telemetry.addData("Set Lift Power", "%4.2f",sp );
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
