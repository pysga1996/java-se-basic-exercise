package com.basic.sample.ex1;

public class Rectangle {
    private double width, height;

    public Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return this.width * this.height;
    }

    double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
