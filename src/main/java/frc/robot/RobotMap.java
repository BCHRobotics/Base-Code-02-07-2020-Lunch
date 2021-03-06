/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {

    //MOTORS

    //Drive Train
    public static int SPARK_FRONTLEFT = 11;
    public static int SPARK_FRONTRIGHT = 15;
    public static int SPARK_BACKLEFT = 12;
    public static int SPARK_BACKRIGHT = 16;

    //Shooter
    public static int SPARK_SHOOTERTURRET = 0;
    public static int SPARK_SHOOTERWHEEL = 0;
    public static int SPARK_SHOOTERHOOD = 0;

    //BallHandler
    public static int TALON_BALLHANDLE0 = 0;
    public static int TALON_BALLHANDLE1 = 0;
    public static int TALON_BALLHANDLE2 = 0;
    public static int TALON_BALLHANDLE3 = 0;

    //Retriever
    public static int TALON_ARM = 0;
    public static int TALON_BAR = 0;

    /********************************** */
    
    //SENSORS
   
    //Ballhandler
    public static int DIO_BALLSENSE0 = 0;
    public static int DIO_BALLSENSE1 = 1;
    public static int DIO_BALLSENSE2 = 2;
    public static int DIO_BALLSENSE3 = 3;
    public static int DIO_BALLSENSE4 = 4;



    /********************************** */

    //CONTROLERS

    public static int OI_DRIVESTICK_USB = 0;
    public static int OI_FUNSTICK_USB = 1;
    public static int OI_PROSTICK_USB = 2;
    public static int OI_TESTSTICK_USB = 3;

    //DriveStick Axis
    public static int OI_DRIVESTICK_MOVEY = 1;
    public static int OI_DRIVESTICK_TURN = 0;

    public static int OI_DRIVESTICK_INTAKEIN = 3;
    public static int OI_DRIVESTICK_INTAKEOUT = 2;

    //DriveStick Buttons
    public static int BTN_DRIVESTICK_SNAIL = 5;
    public static int BTN_DRIVESTICK_TURBO = 6;
    
    //FunStick Axis
    public static int OI_FUNSTICK_TURRETTURN = 0;
    public static int OI_FUNSTICK_SHOOTSPEED = 3;

    public static int OI_FUNSTICK_INTAKEIN = 3;
    public static int OI_FUNSTICK_INTAKEOUT = 2;

    public static int OI_FUNSTICK_MANUALWHEEL = 4;

    public static int OI_FUNSTICK_CLIMBSPEED = 1;

    //FunStick Buttons
    public static int BTN_FUNSTICK_HOODDOWN = 5;
    public static int BTN_FUNSTICK_HOODUP = 6;
    public static int BTN_FUNSTICK_VISION = 3;

    public static int BTN_FUNSTICK_AUTOWHEEL = 1;
    public static int BTN_FUNSTICK_WHEELIN = 2;
    public static int BTN_FUNSTICK_WHEELOUT = 4;

    public static int BTN_FUNSTICK_CHANGEMODE = 7;

    public static int BTN_FUNSTICK_CLIMBLOCK = 1;
    public static int BTN_FUNSTICK_CLIMBUNLOCK = 2;

    /********************************** */

    //PID
    public static double P_DRIVETRAIN = 1;
    public static double I_DRIVETRAIN = 0;
    public static double D_DRIVETRAIN = 0;

    public static double P_NAVX= 1;
    public static double I_NAVX = 0;
    public static double D_NAVX = 0;

    public static double P_DRIVETRAIN_OLD = 2.25;
    public static double I_DRIVETRAIN_OLD = 0.0001;
    public static double D_DRIVETRAIN_OLD = 0;

    public static double P_NAVX_OLD = 1.75;
    public static double I_NAVX_OLD = 0.0001;
    public static double D_NAVX_OLD = 0;

    public static double P_TURRET = 1;
    public static double I_TURRET = 0;
    public static double D_TURRET = 0;

    public static double P_WHEEL = 1;
    public static double I_WHEEL = 0;
    public static double D_WHEEL = 0;






}
 