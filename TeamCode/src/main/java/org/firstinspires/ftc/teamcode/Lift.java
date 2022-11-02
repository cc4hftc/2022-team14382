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

    public void up() {
        telemetry.addLine("Lift Motor Up");
        liftMotor.setPower(1);

    }

    public void down() {
        telemetry.addLine("Lift Motor Down");
        liftMotor.setPower(-0.5);
    }

    public void stop() {
        liftMotor.setPower(0);
    }
}
