package com.chen.exercise2;

import com.chen.exercise2.RobotStatus;

import java.util.List;

/**
 * Created by: ccong
 * Date: 19/1/21 下午9:59
 */
public class RightFoot extends RobotPartAbstract{
    private int maxCharge = 100;
    private RobotStatus robotStatus = RobotStatus.OFF;

    public void setRobotStatus(RobotStatus robotStatus) {
        this.robotStatus = robotStatus;
    }

    public void doAction() {
        System.out.println("RightFoot doAction");
    }
}
