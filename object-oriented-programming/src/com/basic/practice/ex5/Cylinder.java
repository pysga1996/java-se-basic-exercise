package com.basic.practice.ex5;

public class Cylinder extends Circle {
    private double high = 5;

    public Cylinder() {

    }

    public Cylinder(String color, double radius, boolean filled, double high) {
        super(color, radius, filled);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double getArea() {
        return Math.pow(getRadius(),2) * high * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with color "
                + getColor()
                + ", radius = "
                + getRadius()
                + ", high = "
                + getHigh()
                + ", which is a subclass of "
                + super.toString();
    }
}
