package com.basic.sample.ex5;

public class Circle {
    private float radius;
    private String color = "Transparent";
    private boolean filled = false;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
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
}
