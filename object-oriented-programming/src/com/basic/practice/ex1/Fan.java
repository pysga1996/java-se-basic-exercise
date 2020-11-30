package com.basic.practice.ex1;

public class Fan {

    final short SLOW = 1;
    final short MEDIUM = 2;
    final short FAST = 3;
    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    private boolean isOn() {
        return on;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.isOn()) {
            return "Fan color is " + this.color + ", fan radius is " + this.radius
                + " and fan is on";
        } else {
            return "Fan color is " + this.color + ", fan radius is " + this.radius
                + " and fan is off";
        }
    }
}
