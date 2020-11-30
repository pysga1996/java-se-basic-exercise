package com.basic.practice.ex2;

import common.Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInTwoDimensionsArray implements Exercise {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        do {
            System.out.print("Enter the number of rows:");
            rows = input.nextInt();
            if (rows > 20) {
                System.out.println("The number of rows should not exceed 20");
            }
        } while (rows > 20);
        do {
            System.out.print("Enter the number of columns:");
            columns = input.nextInt();
            if (columns > 20) {
                System.out.println("The number of columns should not exceed 20");
            }
        } while (columns > 20);

        System.out.println(
            "Max value of the matrix is " + findMaxValueElement(drawMatrix(rows, columns)));
    }

    private static int[][] drawMatrix(int rows, int columns) {
        Scanner input = new Scanner(System.in);
        int[][] my_array = new int[rows][columns];
        int i = 0;
        while (i < my_array.length) {
            System.out.print("Row " + (i + 1));
            System.out.println();
            int j = 0;
            while (j < my_array[i].length) {
                System.out.print("Enter element" + (j + 1) + " : ");
                my_array[i][j] = input.nextInt();
                j++;
            }
            System.out.println();
            i++;
        }
        for (int[] row : my_array) {
            System.out.println(Arrays.toString(row));
        }
        return my_array;
    }

    private static int findMaxValueElement(int[][] array) {
        int max = array[0][0];
        for (int[] row : array) {
            for (int column : row) {
                if (column > max) {
                    max = column;
                }
            }
        }
        return max;
    }
}
