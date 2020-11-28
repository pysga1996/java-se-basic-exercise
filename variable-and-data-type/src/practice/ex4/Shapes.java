package practice.ex4;

import common.Exercise;
import java.util.Scanner;

public class Shapes implements Exercise {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Draw the isosceles triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out
                        .println("Draw the square triangle (The corner is square at bottom-left)");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out
                        .println("Draw the square triangle (The corner is square at top-left)");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out
                        .println("Draw the square triangle (The corner is square at bottom-right)");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out
                        .println("Draw the square triangle (The corner is square at top-right)");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i - 1; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 6 - i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
        while (choice != 0);
    }
}
