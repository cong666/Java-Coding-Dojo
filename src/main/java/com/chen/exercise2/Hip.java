package com.chen.exercise2;

import com.chen.exercise2.RightFoot;
import com.chen.exercise2.RobotStatus;

/**
 * Created by: ccong
 * Date: 19/1/21 下午10:59
 */
public class Hip extends RobotPartAbstract {
    private int maxCharge = 100;
    private RobotStatus robotStatus = RobotStatus.OFF;

    public void setRobotStatus(RobotStatus robotStatus) {
        this.robotStatus = robotStatus;
    }

    public void doAction() {
        System.out.println("Hip doAction");
    }

    public void doReport() {
        System.out.println(this.robotStatus);
    }

    public double calculateTotalCost() {
        return 0.2*maxCharge/1000;
    }
}
