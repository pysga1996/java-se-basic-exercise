package com.basic.practice.ex3;

import common.Exercise;
import java.util.Random;

public class StopWatchExample implements Exercise {

    @Override
    public void start() {
        Random random_number = new Random();
        StopWatch stop_watch_1 = new StopWatch();
        System.out.println("Create an array with 100000 random numbers");
        int[] arr1 = new int[100000];
        for (int array_element : arr1) {
            array_element = random_number.nextInt();
        }
        System.out.println("Timer start: begin sorting array");
        stop_watch_1.start();
        SelectionSort.selectionSort(arr1);
        System.out.println("Timer stop: finish sorting array");
        stop_watch_1.stop();
        System.out.println(
            "Total amount of time to sort the array is: " + stop_watch_1.getElapsedTime()
                + " milliseconds");
    }
}
