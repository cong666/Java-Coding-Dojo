package com.chen.exercise2;

/**
 * Created by: ccong
 * Date: 19/1/22 下午11:15
 */
public class RobotAdapter {
    public static void connect(RobotPart from, RobotPart to) {
        to.robotPartList.add(from);
    }
}
