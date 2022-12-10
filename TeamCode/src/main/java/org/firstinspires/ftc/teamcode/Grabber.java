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

    public void close() {
        setPosition(0);
    }

    public void open() {
        setPosition(60);
    }

    private void setPosition(double position) {
        telemetry.addData("Grabber Pos ", "%4.2f",position );
        servo.setPosition(position);
    }

}


