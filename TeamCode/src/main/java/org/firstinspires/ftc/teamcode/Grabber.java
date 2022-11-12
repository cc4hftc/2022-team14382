package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Grabber {
    private Telemetry telemetry=null;
    private Servo servo=null;

    public Grabber(Telemetry telemetry, Servo servo) {
        this.telemetry = telemetry;
        this.servo = servo;
    }

    public void hold() {
        setPosition(0);
    }

    public void drop() {
        setPosition(1);
    }

    public void idle() {
        telemetry.addData("Grabber Pos ", "idle" );
    }

    private void setPosition(double pos) {
        telemetry.addData("Grabber Pos ", "%4.2f",pos );
        servo.setPosition(pos);
    }

}


