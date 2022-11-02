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
        telemetry.addLine("Lift Motor Up");
        liftMotor.setPower(power);

    }

    public void stop() {
        liftMotor.setPower(0);
    }
}
