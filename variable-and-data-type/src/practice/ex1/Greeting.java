package practice.ex1;

import common.Exercise;
import java.util.Scanner;

public class Greeting implements Exercise {

    @Override
    public void start() {
        System.out.println("Enter your name: ");
        Scanner my_scanner = new Scanner(System.in);
        String name = my_scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
