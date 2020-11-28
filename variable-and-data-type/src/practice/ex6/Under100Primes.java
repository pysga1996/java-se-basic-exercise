package practice.ex6;

import common.Exercise;

public class Under100Primes implements Exercise {

    @Override
    public void start() {
        int count = 2;
        System.out.println(count);
        count++;
        while (count < 100) {
            if (prime(count)) {
                System.out.println(count);
            }
            count++;
        }
    }

    private static boolean prime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < (int) Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}