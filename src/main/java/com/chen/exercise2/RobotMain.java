package com.chen.exercise2;

import com.chen.exercise2.Dashboard;
import com.chen.exercise2.Hip;
import com.chen.exercise2.LeftArm;
import com.chen.exercise2.RightFoot;
import com.chen.exercise2.RightPowerLimb;
import com.chen.exercise2.RightThigh;
import com.chen.exercise2.RobotBus;
import com.chen.exercise2.Shoulder;

/**
 * Created by: ccong
 * Date: 19/1/22 下午9:58
 */
public class RobotMain {
    public static void main(String args[]) {
        //init
        LeftArm leftArm = new LeftArm();
        RightFoot rightFoot = new RightFoot();
        Hip hip = new Hip();
        RightPowerLimb rightPowerLimb = new RightPowerLimb();
        RightThigh rightThigh = new RightThigh();
        Shoulder shoulder = new Shoulder();

        //connect to each other
        RobotAdapter.connect(rightPowerLimb,rightThigh);
        RobotAdapter.connect(leftArm,shoulder);
        RobotAdapter.connect(rightFoot,rightPowerLimb);
        RobotAdapter.connect(rightThigh,hip);
        RobotAdapter.connect(rightFoot,hip);
        RobotAdapter.connect(rightPowerLimb,hip);

        //robot bus connection
        RobotBus robotBus = new RobotBus();
        RobotAdapter.connect(leftArm,robotBus);
        RobotAdapter.connect(rightFoot,robotBus);
        RobotAdapter.connect(hip,robotBus);
        RobotAdapter.connect(rightPowerLimb,robotBus);
        RobotAdapter.connect(rightThigh,robotBus);
        RobotAdapter.connect(shoulder,robotBus);

        //init dashboard
        Dashboard dashboard = new Dashboard(robotBus);

        //do report
        dashboard.doReport();

        System.out.println("cost : "+dashboard.calculateTotalCost());

    }
}
