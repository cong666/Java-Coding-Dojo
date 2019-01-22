package com.chen.exercise1;

/**
 * Created by: ccong
 * Date: 19/1/21 下午11:18
 */
public class Shoulder {
    private int maxCharge = 100;
    private RobotStatus robotStatus;

    private LeftArm leftArm;

    public int getMaxCharge() {
        return maxCharge;
    }

    public void setMaxCharge(int maxCharge) {
        this.maxCharge = maxCharge;
    }

    public RobotStatus getRobotStatus() {
        return robotStatus;
    }

    public void setRobotStatus(RobotStatus robotStatus) {
        this.robotStatus = robotStatus;
    }

    public LeftArm getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(LeftArm leftArm) {
        this.leftArm = leftArm;
    }

    public void connect(Object o) {
        if(o instanceof LeftArm) {
            this.setLeftArm((LeftArm) o);
        }
    }
}
