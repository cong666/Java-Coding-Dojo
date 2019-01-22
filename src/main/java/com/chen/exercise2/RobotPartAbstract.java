package com.chen.exercise2;

import com.chen.exercise2.RobotStatus;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by: ccong
 * Date: 19/1/21 下午10:03
 */
public abstract class RobotPartAbstract implements RobotPart {

    public void sendCommand() {
        for(RobotPart rp : robotPartList) {
            rp.doAction();
        }
    }

    public double calculateTotalCost() {
        return 0.0;
    }
}
