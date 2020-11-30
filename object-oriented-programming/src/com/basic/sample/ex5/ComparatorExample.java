package com.basic.sample.ex5;

import common.Exercise;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample implements Exercise {

    @Override
    public void start() {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6f);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5f, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator<Circle> circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}