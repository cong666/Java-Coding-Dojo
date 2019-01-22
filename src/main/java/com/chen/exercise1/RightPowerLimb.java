package com.chen.exercise1;

/**
 * Created by: ccong
 * Date: 19/1/21 下午9:59
 */
public class RightPowerLimb {
    private int maxCharge=100;
    private RobotStatus robotStatus = RobotStatus.OFF;

    private RightFoot rightFoot;

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

    public RightFoot getRightFoot() {
        return rightFoot;
    }

    public void setRightFoot(RightFoot rightFoot) {
        this.rightFoot = rightFoot;
    }

    public void connect(Object o) {
        if(o instanceof RightFoot) {
            this.setRightFoot((RightFoot) o);
        }
    }
}
