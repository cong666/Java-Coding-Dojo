package com.chen.exercise1;

/**
 * Created by: ccong
 * Date: 19/1/22 下午9:58
 */
public class RobotMain {
    public static void main(String args[]) {
        LeftArm leftArm = new LeftArm();
        RightFoot rightFoot = new RightFoot();
        Hip hip = new Hip();
        RightPowerLimb rightPowerLimb = new RightPowerLimb();
        RightThigh rightThigh = new RightThigh();
        Shoulder shoulder = new Shoulder();

        rightThigh.setRightPowerLimb(rightPowerLimb);
        shoulder.setLeftArm(leftArm);
        rightPowerLimb.setRightFoot(rightFoot);
        hip.setRightThigh(rightThigh);
        hip.setRightFoot(rightFoot);
        hip.setRightPowerLimb(rightPowerLimb);

        RobotBus robotBus = new RobotBus();
        Dashboard dashboard = new Dashboard();

        //connection
        robotBus.connect(leftArm);
        robotBus.connect(rightFoot);
        robotBus.connect(hip);
        robotBus.connect(rightPowerLimb);
        robotBus.connect(rightThigh);
        robotBus.connect(shoulder);

        //setup robot bus
        dashboard.setRobotBus(robotBus);

        dashboard.report();

        System.out.println("cost : "+dashboard.calculateTotalCost());

    }
}
