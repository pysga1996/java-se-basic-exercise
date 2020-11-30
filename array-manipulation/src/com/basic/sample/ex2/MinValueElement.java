package com.basic.sample.ex2;

import common.Exercise;

public class MinValueElement implements Exercise {

    @Override
    public void start() {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = this.minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    private int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i <= array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
