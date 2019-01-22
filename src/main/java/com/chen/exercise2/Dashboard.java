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
    }

    public double calculateTotalCost() {
        return robotBus.calculateTotalCost();
    }
}
