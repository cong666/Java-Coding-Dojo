package com.chen.exercise1;

/**
 * Created by: ccong
 * Date: 19/1/21 下午10:59
 */
public class Hip {
    private int maxCharge = 100;
    private RobotStatus robotStatus = RobotStatus.OFF;

    private RightThigh rightThigh;
    private RightPowerLimb rightPowerLimb;
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

    public RightThigh getRightThigh() {
        return rightThigh;
    }

    public void setRightThigh(RightThigh rightThigh) {
        this.rightThigh = rightThigh;
    }

    public RightPowerLimb getRightPowerLimb() {
        return rightPowerLimb;
    }

    public void setRightPowerLimb(RightPowerLimb rightPowerLimb) {
        this.rightPowerLimb = rightPowerLimb;
    }

    public RightFoot getRightFoot() {
        return rightFoot;
    }

    public void setRightFoot(RightFoot rightFoot) {
        this.rightFoot = rightFoot;
    }

    public void connect(Object o) {
        if(o instanceof RightPowerLimb) {
            this.setRightPowerLimb((RightPowerLimb) o);
        } else if (o instanceof RightFoot) {
            this.setRightFoot((RightFoot) o);
        } else if (o instanceof RightThigh) {
            this.setRightThigh((RightThigh) o);
        }
    }
}
