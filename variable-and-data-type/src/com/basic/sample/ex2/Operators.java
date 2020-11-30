package com.basic.sample.ex2;

import common.Exercise;
import java.util.Scanner;

public class Operators implements Exercise {

    @Override
    public void start() {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
