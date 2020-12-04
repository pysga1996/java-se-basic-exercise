package com.codegym.ex1;

public class TriangleClassifier {

    public static Enum<Triangle> classifyTriangle(double a, double b, double c) {
        try {
            String message = "Triangle edges must be positive";
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException(message);
            }
            if (Math.abs(a - b) < c && (a + b) > c) {
                if (a == b && b == c) {
                    return Triangle.EQUILATERAL_TRIANGLE;
                } else if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
                    return Triangle.ISOSCELES_TRIANGLE;
                } else {
                    return Triangle.NORMAL_TRIANGLE;
                }
            } else {
                return Triangle.NOT_A_TRIANGLE;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return Triangle.NOT_A_TRIANGLE;
        }
    }
}
