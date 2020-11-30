package com.basic.practice.ex6;

import common.Exercise;
import java.util.Scanner;

public class CharacterAppearancesInStringCount implements Exercise {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String my_string = input.nextLine();
        System.out.println("Enter the character you want to count: ");
        char my_char = input.findInLine(".").charAt(0);
        System.out.println(
            "The number of the character's appearances is: " + countAppearancesOfACharacter(
                my_string, my_char));
    }

    private static int countAppearancesOfACharacter(String string, char X) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == X) {
                count++;
            }
        }
        return count;
    }
}
