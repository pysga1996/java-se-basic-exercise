package com.basic.practice.ex1;

import common.Exercise;

public class FanExample implements Exercise {

    @Override
    public void start() {
        Fan fan_1 = new Fan();
        fan_1.setSpeed(fan_1.FAST);
        fan_1.setRadius(10);
        fan_1.setColor("yellow");
        fan_1.setOn(true);
        System.out.println(fan_1.toString());
        Fan fan_2 = new Fan();
        fan_2.setSpeed(fan_1.MEDIUM);
        fan_2.setRadius(5);
        fan_2.setColor("blue");
        fan_2.setOn(false);
        System.out.println(fan_2.toString());
    }
}
