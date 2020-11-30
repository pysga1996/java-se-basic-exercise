package com.basic.practice.ex8;

import common.Exercise;
import java.util.Scanner;
import java.util.Arrays;

public class ElementsOnDiagonalLinesSum implements Exercise {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter your matrix size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        int[][] my_array = new int[size][size];
        for (int i = 0; i < my_array.length; i++) {
            System.out.println("Row " + (i + 1) + ": ");
            for (int j = 0; j < my_array[i].length; j++) {
                System.out.print("Enter element " + (j + 1) + ": ");
                my_array[i][j] = input.nextInt();
            }
        }
        for (int[] column : my_array) {
            System.out.println(Arrays.toString(column));
        }
        System.out.println(
            "Sum of elements on diagonal lines is: " + countSumOfElementsOnDiagonalLine(my_array));
    }

    private static int countSumOfElementsOnDiagonalLine(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
            if (i != (array.length - 1 - i)) {
                sum += array[i][array.length - 1 - i];
            }
        }
        return sum;
    }
}
