package com.chen.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: ccong
 * Date: 19/1/21 下午11:55
 */
public interface RobotPart {
    List<RobotPart> robotPartList = new ArrayList();
    void doAction();
    void doReport();
    double calculateTotalCost();
}
