package com.chen.exercise1;

/**
 * Created by: ccong
 * Date: 19/1/21 下午10:24
 */
public class Dashboard {
    private RobotBus robotBus;

    public RobotBus getRobotBus() {
        return robotBus;
    }

    public void setRobotBus(RobotBus robotBus) {
        this.robotBus = robotBus;
    }

    //Everytime we have a new robot part added and connected to the RobotBus,this method need to be changed
    public void report() {
        System.out.println("Robot Bus : "+robotBus.getRobotStatus());
        System.out.println("-Left Arm : "+robotBus.getLeftArm().getRobotStatus());
        System.out.println("-Right Foot : "+robotBus.getRightFoot().getRobotStatus());
        System.out.println("-Right Thigh : "+robotBus.getRightThigh().getRobotStatus());
        System.out.println("-Right Power limb : "+robotBus.getRightPowerLimb().getRobotStatus());
        System.out.println("-Hip : "+robotBus.getHip().getRobotStatus());
        System.out.println("-Shoulder : "+robotBus.getShoulder().getRobotStatus());
    }

    //Everytime we have a new robot part added and connected to the RobotBus,this method need to be changed
    public double calculateTotalCost() {
        double leftArmChargeCost = robotBus.getLeftArm().getMaxCharge()*0.2/1000;
        double rightFootChargeCost = robotBus.getRightFoot().getMaxCharge()*0.2/1000;
        double rightThighChargeCost = robotBus.getRightThigh().getMaxCharge()*0.2/1000;
        double rightPowerLimbChargeCost = robotBus.getRightPowerLimb().getMaxCharge()*0.2/1000;
        double hipChargeCost = robotBus.getHip().getMaxCharge()*0.2/1000;
        double shoulderChargeCost = robotBus.getShoulder().getMaxCharge()*0.2/1000;
        return leftArmChargeCost+rightFootChargeCost+
                rightThighChargeCost+rightPowerLimbChargeCost+
                hipChargeCost+shoulderChargeCost;
    }
}
