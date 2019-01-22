package com.chen.exercise2;

import com.chen.exercise2.RobotStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: ccong
 * Date: 19/1/21 下午10:03
 */
public abstract class RobotPartAbstract implements RobotPart {

    public void connect(RobotPart from, RobotPart to) {
        to.robotPartList.add(from);
    }

    public void sendCommand() {
        for(RobotPart rp : robotPartList) {
            rp.doAction();
        }
    }

    public List<RobotPart> getRobotPartList() {
        return robotPartList;
    }

    public void doReport() {
        for(RobotPart rp : robotPartList) {
            rp.doReport();
        }
    }
    public double calculateTotalCost() {
        double cost = 0.0;
        List<RobotPart> robotPartList = this.getRobotPartList();
        for(RobotPart rp : robotPartList) {
            cost+=rp.calculateTotalCost();
        }
        return cost;
    }
}