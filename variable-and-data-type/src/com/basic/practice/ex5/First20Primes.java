package com.basic.practice.ex5;

import common.Exercise;

public class First20Primes implements Exercise {

    @Override
    public void start() {
        int count = 0;
        int number = 2;
        while (count < 20) {
            if (prime(number)) {
                System.out.println(number);
                number++;
                count++;
            } else {
                number++;
            }
        }
    }

    private static boolean prime(int number) {
        boolean isPrime = true;
        if (number < 2) {
            isPrime = false;
        } else if (number > 2) {
            for (int i = 2; i < (int) Math.sqrt(number) + 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}