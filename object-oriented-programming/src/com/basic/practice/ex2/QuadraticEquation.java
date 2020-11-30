package com.basic.practice.ex2;

import java.lang.Math;

public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getA() {
        return a;
    }

    private double getB() {
        return b;
    }

    private double getC() {
        return c;
    }

    private double getDiscriminant() {
        return Math.pow(getB(), 2) - 4 * getA() * getC();
    }

    private double getRoot1() {
        return (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
    }

    private double getRoot2() {
        return (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
    }

    void solve() {
        if (getDiscriminant() > 0) {
            System.out.println("The equation has 2 roots " + getRoot1() + " and " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("The equation has 1 root " + getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
