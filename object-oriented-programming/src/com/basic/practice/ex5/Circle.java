package com.basic.practice.ex5;

public class Circle {
    private double radius = 1.0;
    private String color = "green";
    private boolean filled = true;

    public Circle() {
    }

    public Circle(String color, double radius, boolean filled) {
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with color "
                + getColor()
                + ", radius = "
                + getRadius();
    }
}
