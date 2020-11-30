package com.illegal_triangle_exception;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle T = new Triangle(1,21,3);
        } catch (IllegalTriangleException e) {
            System.out.println("The 3 parameters you entered are not 3 side of a triangle!");
        }
    }
}
