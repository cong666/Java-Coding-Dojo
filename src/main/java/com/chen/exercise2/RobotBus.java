package com.chen.exercise2;

import com.chen.exercise2.*;
import com.chen.exercise2.LeftArm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: ccong
 * Date: 19/1/21 下午10:03
 */
public class RobotBus extends RobotPartAbstract {
    private RobotStatus robotStatus = RobotStatus.OFF;

    public void doAction() {
        this.sendCommand();
    }

    public void doReport() {
        System.out.println(this.robotStatus);
    }
}
