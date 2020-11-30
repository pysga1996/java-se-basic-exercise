package com.basic.practice.ex4;

import common.Exercise;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveElementFromArray implements Exercise {

    @Override
    public void start() {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Enter the position of the element you want to remove from the array: ");
        int index = input.nextInt();
        System.out.println(Arrays.toString(removeElementFromArray(array, index)));
    }

    private static int[] removeElementFromArray(int[] array, int index) {
        System.arraycopy(array, index, array, index - 1, array.length - index);
        array[array.length - 1] = 0;
        return array;
    }
}
