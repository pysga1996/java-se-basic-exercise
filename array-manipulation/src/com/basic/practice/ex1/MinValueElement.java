package com.basic.practice.ex1;

import common.Exercise;
import java.util.Scanner;
import java.util.Arrays;

public class MinValueElement implements Exercise {

    @Override
    public void start() {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int index = 1;
        for (i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i + 1;
            }
        }
        System.out.println(
            "The smallest property value in the list is " + min + " ,at position " + index);
    }
}
