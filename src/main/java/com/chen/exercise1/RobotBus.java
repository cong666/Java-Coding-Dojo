package com.chen.exercise1;

/**
 * Created by: ccong
 * Date: 19/1/21 下午10:03
 */
public class RobotBus {
    private RobotStatus robotStatus = RobotStatus.OFF;

    private LeftArm leftArm;
    private RightFoot rightFoot;
    private RightThigh rightThigh;
    private RightPowerLimb rightPowerLimb;
    private Hip hip;
    private Shoulder shoulder;

    public LeftArm getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(LeftArm leftArm) {
        this.leftArm = leftArm;
    }

    public RightFoot getRightFoot() {
        return rightFoot;
    }

    public void setRightFoot(RightFoot rightFoot) {
        this.rightFoot = rightFoot;
    }

    public RobotStatus getRobotStatus() {
        return robotStatus;
    }

    public void setRobotStatus(RobotStatus robotStatus) {
        this.robotStatus = robotStatus;
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

    public Hip getHip() {
        return hip;
    }

    public void setHip(Hip hip) {
        this.hip = hip;
    }

    public Shoulder getShoulder() {
        return shoulder;
    }

    public void setShoulder(Shoulder shoulder) {
        this.shoulder = shoulder;
    }

    ////Everytime we have a new robot part added and connected to the RobotBus,this method need to be changed
    public void connect(Object o) {
        if(o instanceof  LeftArm) {
            this.setLeftArm((LeftArm) o);
        } else if(o instanceof RightFoot) {
            this.setRightFoot((RightFoot) o);
        } else if(o instanceof RightThigh) {
            this.setRightThigh((RightThigh) o);
        } else if (o instanceof RightPowerLimb) {
            this.setRightPowerLimb((RightPowerLimb) o);
        } else if (o instanceof Hip) {
            this.setHip((Hip) o);
        } else if (o instanceof Shoulder) {
            this.setShoulder((Shoulder) o);
        }
    }

}
