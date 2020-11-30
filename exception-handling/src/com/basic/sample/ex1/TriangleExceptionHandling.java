package com.basic.sample.ex1;

import common.Exercise;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleExceptionHandling implements Exercise {

    @Override
    public void start() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first edge length:");
            int firstEdge = scanner.nextInt();
            System.out.println("Enter second edge length:");
            int secondEdge = scanner.nextInt();
            System.out.println("Enter third edge length:");
            int thirdEdge = scanner.nextInt();
            Triangle T = new Triangle(firstEdge, secondEdge, thirdEdge);
            System.out.println("Triangle is valid!");
        } catch (IllegalTriangleException e) {
            System.err.println("The 3 parameters you entered are not 3 side of a triangle!");
        } catch (InputMismatchException ex) {
            System.err.println("Not a valid edge length!");
        }
    }
}
