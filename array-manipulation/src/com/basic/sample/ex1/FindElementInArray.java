package com.basic.sample.ex1;

import common.Exercise;
import java.util.Scanner;

public class FindElementInArray implements Exercise {

    @Override
    public void start() {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor",
            "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println(
                    "Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
