package com.chen.exercise2;

/**
 * Created by: ccong
 * Date: 19/1/22 上午12:23
 */
public class Dashboard {

    private RobotBus robotBus;

    public Dashboard(RobotBus robotBus) {
        this.robotBus = robotBus;
    }

    public void doReport() {
        this.robotBus.doReport();
        for(RobotPart rp : robotBus.robotPartList) {
            rp.doReport();
        }
    }

    public double calculateTotalCost() {
        double cost = 0.0;
        for(RobotPart rp : robotBus.robotPartList) {
            cost+=rp.calculateTotalCost();
        }
        return cost;
    }
}
