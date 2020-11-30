package com.basic.practice.ex2;

import common.Exercise;
import java.util.Scanner;

public class QuadraticEquationExample implements Exercise {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();
        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        equation1.solve();
    }
}
