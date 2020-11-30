package com.basic.sample.ex1;

import java.lang.Math;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (this.side1 <= Math.abs(this.side2 - this.side3) || this.side1 >= (this.side2
            + this.side3)) {
            throw new IllegalTriangleException();
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }

    private double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
            + " Side 3 = " + side3;
    }

}
