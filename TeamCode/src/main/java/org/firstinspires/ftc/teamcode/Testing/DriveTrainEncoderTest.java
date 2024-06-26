package org.firstinspires.ftc.teamcode.Testing;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.DriveConstance;

@TeleOp
public class DriveTrainEncoderTest extends DriveConstance {
    @Override
    public void runOpMode() throws InterruptedException {
        if (opModeInInit()) {
            initRobot();
            frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
            backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
            frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
            backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }

        waitForStart();
        while (opModeIsActive()) {
            telemetry.addData("frontLeftEncoder: ", frontLeft.getCurrentPosition());
            telemetry.addData("backLeftEncoder: ", backLeft.getCurrentPosition());
            telemetry.addData("frontRightEncoder: ", frontRight.getCurrentPosition());
            telemetry.addData("backRightEncoder: ", backRight.getCurrentPosition());

        }
    }
}
