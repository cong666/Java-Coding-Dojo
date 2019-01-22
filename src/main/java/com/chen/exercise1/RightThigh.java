package com.chen.exercise1;

/**
 * Created by: ccong
 * Date: 19/1/21 下午9:59
 */
public class RightThigh {
    private int maxCharge=100;
    private RobotStatus robotStatus;

    private RightPowerLimb rightPowerLimb;

    public int getMaxCharge() {
        return maxCharge;
    }

    public RobotStatus getRobotStatus() {
        return robotStatus;
    }

    public void setRobotStatus(RobotStatus robotStatus) {
        this.robotStatus = robotStatus;
    }

    public void setMaxCharge(int maxCharge) {
        this.maxCharge = maxCharge;
    }

    public RightPowerLimb getRightPowerLimb() {
        return rightPowerLimb;
    }

    public void setRightPowerLimb(RightPowerLimb rightPowerLimb) {
        this.rightPowerLimb = rightPowerLimb;
    }

    public void connect(Object o) {
        if (o instanceof RightPowerLimb) {
            this.setRightPowerLimb((RightPowerLimb) o);
        }
    }
}
