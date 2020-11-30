package com.basic.practice.ex5;

import common.Exercise;

public class CircleAndCylinderExample implements Exercise {

    @Override
    public void start() {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("crimson", 7, false);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder("navy", 15, false, 10);
        System.out.println(cylinder);
    }
}
