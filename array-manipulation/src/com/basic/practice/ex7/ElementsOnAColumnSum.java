package com.basic.practice.ex7;

import common.Exercise;
import java.util.Scanner;
import java.util.Arrays;

public class ElementsOnAColumnSum implements Exercise {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        int number_of_rows, number_of_columns;
        do {
            System.out.print("Enter the numbers of matrix's rows: ");
            number_of_rows = input.nextInt();
            if (number_of_rows > 20) {
                System.out.println("The number of rows should not exceed 20");
            }
        } while (number_of_rows > 20);
        do {
            System.out.print("Enter the numbers of matrix's columns: ");
            number_of_columns = input.nextInt();
            if (number_of_columns > 20) {
                System.out.println("The number of rows should not exceed 20");
            }
        } while (number_of_columns > 20);
        int[][] my_array = new int[number_of_rows][number_of_columns];
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
        int column_to_count_sum;
        do {
            System.out.println("Enter the column you want to count sum: ");
            column_to_count_sum = input.nextInt();
            if (column_to_count_sum > number_of_columns) {
                System.out.println("The column you entered exceeds the number of columns");
            }
        } while (column_to_count_sum > number_of_columns);
        System.out.println("Sum of elements on column " + column_to_count_sum + " is: "
            + countSumOfElementsOnAColumn(my_array, column_to_count_sum));
    }

    private static int countSumOfElementsOnAColumn(int[][] array, int column) {
        int sum = 0;
        for (int[] row : array) {
            sum += row[column - 1];
        }
        return sum;
    }
}
