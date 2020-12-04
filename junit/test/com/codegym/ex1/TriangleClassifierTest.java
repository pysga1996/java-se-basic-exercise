package com.codegym.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    void testClassifyTriangle1() {
        int a = 2;
        int b = 2;
        int c = 2;
        Enum<Triangle> expected = Triangle.EQUILATERAL_TRIANGLE;
        Enum<Triangle> result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle2() {
        int a = 2;
        int b = 2;
        int c = 3;
        Enum<Triangle> expected = Triangle.ISOSCELES_TRIANGLE;
        Enum<Triangle> result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle3() {
        int a = 3;
        int b = 4;
        int c = 5;
        Enum<Triangle> expected = Triangle.NORMAL_TRIANGLE;
        Enum<Triangle> result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle4() {
        int a = 3;
        int b = 4;
        int c = 5;
        Enum<Triangle> expected = Triangle.NORMAL_TRIANGLE;
        Enum<Triangle> result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle5() {
        int a = 3;
        int b = 4;
        int c = 5;
        Enum<Triangle> expected = Triangle.NORMAL_TRIANGLE;
        Enum<Triangle> result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle6() {
        int a = 8;
        int b = 2;
        int c = 3;
        Enum<Triangle> expected = Triangle.NOT_A_TRIANGLE;
        Enum<Triangle> result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle7() {
        int a = -1;
        int b = 2;
        int c = 1;
        Enum<Triangle> expected = Triangle.NOT_A_TRIANGLE;
        Enum<Triangle> result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle8() {
        int a = 0;
        int b = 1;
        int c = 1;
        Enum<Triangle> expected = Triangle.NOT_A_TRIANGLE;
        Enum<Triangle> result = TriangleClassifier.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
}