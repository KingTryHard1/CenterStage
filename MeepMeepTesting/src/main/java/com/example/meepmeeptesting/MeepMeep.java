package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeep {
    public static void main(String[] args) {
        com.noahbres.meepmeep.MeepMeep meepMeep = new com.noahbres.meepmeep.MeepMeep(600);

        Pose2d startPose = new Pose2d(10, 61, Math.toRadians(-90));

        RoadRunnerBotEntity blueRight = new DefaultBotBuilder(meepMeep)
                .setColorScheme(new ColorSchemeRedDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(40, 40, Math.toRadians(142.44960570708554), Math.toRadians(180), 18)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(startPose)
                                .splineToSplineHeading(new Pose2d(11, 32, Math.toRadians(-180)), Math.toRadians(-180))
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)

                                .lineToSplineHeading(new Pose2d(39, 33, Math.toRadians(0)))
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(2)
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {

                                })

                                .strafeTo(new Vector2d(49, 12))
                                .lineTo(new Vector2d(58, 12))

                                .build());

        RoadRunnerBotEntity blueCenter = new DefaultBotBuilder(meepMeep)
                .setColorScheme(new ColorSchemeRedDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(40, 40, Math.toRadians(142.44960570708554), Math.toRadians(180), 18)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(startPose)
                                .splineTo(new Vector2d(14.5, 34), Math.toRadians(-90))
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)
                                .back(5)

                                .lineToSplineHeading(new Pose2d(39, 39, Math.toRadians(0)))
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {

                                })

                                .strafeTo(new Vector2d(49, 12))
                                .lineTo(new Vector2d(58, 12))

                                .build());

        RoadRunnerBotEntity blueLeft = new DefaultBotBuilder(meepMeep)
                .setColorScheme(new ColorSchemeRedDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(40, 40, Math.toRadians(142.44960570708554), Math.toRadians(180), 18)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(startPose)
                                .lineTo(new Vector2d(13, 27))
                                .turn(Math.toRadians(90))
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)
                                .back(3)

                                .lineToSplineHeading(new Pose2d(10, 50, Math.toRadians(0)))
                                .setReversed(false)
                                .splineToConstantHeading(new Vector2d(39, 42), Math.toRadians(0))
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {


                                })

                                .strafeTo(new Vector2d(49, 12))
                                .lineTo(new Vector2d(58, 12))

                                .build());

        Pose2d redStartPose = new Pose2d(10, -61, Math.toRadians(90));

        RoadRunnerBotEntity redLeft = new DefaultBotBuilder(meepMeep)
                .setColorScheme(new ColorSchemeRedDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(40, 40, Math.toRadians(142.44960570708554), Math.toRadians(180), 18)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(redStartPose)
                                .splineToSplineHeading(new Pose2d(12,-32, Math.toRadians(180)), Math.toRadians(180))
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)

                                .lineToSplineHeading(new Pose2d(39, -33, Math.toRadians(0)))
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {
                                })
                                .waitSeconds(2)
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)
                                .addTemporalMarker(()->{


                                })

                                .strafeTo(new Vector2d(49,-12))
                                .lineTo(new Vector2d(58, -12))
                                .build());

        RoadRunnerBotEntity redCenter = new DefaultBotBuilder(meepMeep)
                .setColorScheme(new ColorSchemeRedDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(40, 40, Math.toRadians(142.44960570708554), Math.toRadians(180), 18)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(redStartPose)
                                .splineTo(new Vector2d(14.5,-34), Math.toRadians(90))
                                .addTemporalMarker(() -> {


                                })
                                .waitSeconds(1)
                                .back(5)

                                .lineToSplineHeading(new Pose2d(39, -39, Math.toRadians(0)))
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)
                                .addTemporalMarker(()->{

                                })
                                .strafeTo(new Vector2d(49,-12))
                                .lineTo(new Vector2d(58, -12))

                                .build());

        RoadRunnerBotEntity redRight = new DefaultBotBuilder(meepMeep)
                .setColorScheme(new ColorSchemeRedDark())
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(40, 40, Math.toRadians(142.44960570708554), Math.toRadians(180), 18)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(redStartPose)
                                .lineTo(new Vector2d(13,-27))
                                .turn(Math.toRadians(-90))
                                .back(3)
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)

                                .lineToSplineHeading(new Pose2d(10, -50,Math.toRadians(0)))
                                .setReversed(false)
                                .splineToConstantHeading(new Vector2d(39, -42), Math.toRadians(0))
                                .waitSeconds(1)
                                .addTemporalMarker(() -> {

                                })
                                .waitSeconds(1)
                                .addTemporalMarker(()->{


                                })

                                .strafeTo(new Vector2d(49,-12))
                                .lineTo(new Vector2d(58, -12))

                                .build());


        meepMeep.setBackground(com.noahbres.meepmeep.MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(blueLeft)
                .addEntity(blueCenter)
                .addEntity(blueRight)

                .addEntity(redLeft)
                .addEntity(redCenter)
                .addEntity(redRight)
                .start();
    }
}