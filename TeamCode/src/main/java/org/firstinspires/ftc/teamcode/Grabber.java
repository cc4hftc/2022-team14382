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
        telemetry.addLine("Open Grabber");
        servo.setPosition(0.5);
    }
    public void drop() {
        telemetry.addLine("Close Grabber");
        servo.setPosition(-0.5);
    }

}


