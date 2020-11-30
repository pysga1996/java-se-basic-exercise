package com.basic.practice.ex5;

import common.Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoArrays implements Exercise {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        int size_1, size_2;
        do {
            System.out.print("Enter first array length: ");
            size_1 = input.nextInt();
        } while (size_1 > 20);
        int[] array_1 = new int[size_1];
        System.out.println("First array elements");
        for (int i = 0; i < array_1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array_1[i] = input.nextInt();
        }
        do {
            System.out.print("Enter second array length: ");
            size_2 = input.nextInt();
        } while (size_2 > 20);
        int[] array_2 = new int[size_2];
        System.out.println("Second array elements");
        for (int i = 0; i < array_2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array_2[i] = input.nextInt();
        }
        System.out.println("Combine 2 arrays to form the third array");
        System.out.println(Arrays.toString(combineTwoArrays(array_1, array_2)));
    }

    private static int[] combineTwoArrays(int[] array_1, int[] array_2) {
        int[] array_3 = new int[array_1.length + array_2.length];
        System.arraycopy(array_1, 0, array_3, 0, array_1.length);
        System.arraycopy(array_2, 0, array_3, array_1.length, array_2.length);
        return array_3;
    }
}
