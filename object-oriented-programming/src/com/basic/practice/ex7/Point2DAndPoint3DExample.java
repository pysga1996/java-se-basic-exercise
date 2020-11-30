package com.basic.practice.ex7;

import common.Exercise;

public class Point2DAndPoint3DExample implements Exercise {

    @Override
    public void start() {
        Point2D point2d = new Point2D();
        System.out.println(point2d);

        point2d = new Point2D(1, 2);
        System.out.println(point2d);

        Point3D point3d = new Point3D();
        System.out.println(point3d);

        point3d = new Point3D(4, 5, 6);
        System.out.println(point3d);
    }
}
