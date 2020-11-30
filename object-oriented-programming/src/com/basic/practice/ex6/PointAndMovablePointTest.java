package com.basic.practice.ex6;

import common.Exercise;

public class PointAndMovablePointTest implements Exercise {

    @Override
    public void start() {

        Point point = new Point();
        System.out.println(point);
        point = new Point(1, 2);
        System.out.println(point);

        //

        MovablePoint movable_point = new MovablePoint();
        System.out.println(movable_point);
        System.out.println(movable_point.move());
        movable_point = new MovablePoint(1, 2, 30, 50);
        System.out.println(movable_point);
        System.out.println(movable_point.move());
    }
}
