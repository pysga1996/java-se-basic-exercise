package com.basic.practice.ex4;

import common.Exercise;
import java.util.Scanner;

public class ShapeAndTriangleExample implements Exercise {

    @Override
    public void start() {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("beige", true);
        System.out.println(shape);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the color of your triangle: ");
        String color = input.nextLine();
        System.out.print("Is your triangle filled (true/false): ");
        boolean filled = input.nextBoolean();
        System.out.print("Enter the first side of your triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the second side of your triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter the third side of your triangle: ");
        double side3 = input.nextDouble();
        try {
            Triangle triangle = new Triangle(color, filled, side1, side2, side3);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            System.out.println("The 3 parameters you entered are not 3 sides of a triangle!");
        }
    }
}
