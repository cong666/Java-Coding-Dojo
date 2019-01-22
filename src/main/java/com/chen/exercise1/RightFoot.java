package com.chen.exercise1;

/**
 * Created by: ccong
 * Date: 19/1/21 下午9:59
 */
public class RightFoot {
    private int maxCharge=100;
    private RobotStatus robotStatus = RobotStatus.OFF;

    public int getMaxCharge() {
        return maxCharge;
    }

    public RobotStatus getRobotStatus() {
        return robotStatus;
    }

    public void setRobotStatus(RobotStatus robotStatus) {
        this.robotStatus = robotStatus;
    }

    public void doAction() {
        System.out.println("RightArm doAction");
    }
}
