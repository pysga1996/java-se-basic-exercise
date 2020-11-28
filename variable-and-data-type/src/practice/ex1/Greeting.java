package practice.ex1;

import common.Exercise;
import java.util.Scanner;

public class Greeting implements Exercise {

    @Override
    public void start() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
