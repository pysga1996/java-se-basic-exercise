package com.basic.practice.ex3;

import common.Exercise;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray implements Exercise {

    @Override
    public void start() {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Enter element you want to add to array: ");
        int X = input.nextInt();
        System.out.print("Enter the index of the element you want to add to array: ");
        int index = input.nextInt();
        System.out.println(Arrays.toString(addArrayElement(array, X, index)));
    }

    private static int[] addArrayElement(int[] array, int X, int index) {
        System.arraycopy(array, index, array, index + 1, array.length - index - 1);
        array[index] = X;
        return array;
    }
}
