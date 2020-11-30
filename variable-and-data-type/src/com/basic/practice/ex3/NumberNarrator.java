package com.basic.practice.ex3;

import common.Exercise;
import java.util.Scanner;

public class NumberNarrator implements Exercise {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write down your number:");
        int numberToEcho = scanner.nextInt();
        char unitsDigit = '0';
        char tensDigit = '0';
        char hundredsDigit = '0';
        String unitsDigitEcho;
        String tensDigitEcho;
        String hundredsDigitEcho;
        if (numberToEcho >= 0 && numberToEcho <= 9) {
            unitsDigit = Integer.toString(numberToEcho).charAt(0);
        } else if (numberToEcho <= 99) {
            unitsDigit = Integer.toString(numberToEcho).charAt(1);
            tensDigit = Integer.toString(numberToEcho).charAt(0);
        } else if (numberToEcho <= 999) {
            unitsDigit = Integer.toString(numberToEcho).charAt(2);
            tensDigit = Integer.toString(numberToEcho).charAt(1);
            hundredsDigit = Integer.toString(numberToEcho).charAt(0);
        } else {
            System.out.println("Your number is too large to echo!");
        }
        switch (unitsDigit) {
            case '1':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Eleven";
                } else {
                    unitsDigitEcho = "One";
                }
                break;
            case '2':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Twelve";
                } else {
                    unitsDigitEcho = "Two";
                }
                break;
            case '3':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Thirteen";
                } else {
                    unitsDigitEcho = "Three";
                }
                break;
            case '4':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Fourteen";
                } else {
                    unitsDigitEcho = "Four";
                }
                break;
            case '5':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Fifteen";
                } else {
                    unitsDigitEcho = "Five";
                }
                break;
            case '6':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Sixteen";
                } else {
                    unitsDigitEcho = "Six";
                }
                break;
            case '7':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Seventeen";
                } else {
                    unitsDigitEcho = "Seven";
                }
                break;
            case '8':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Eight";
                } else {
                    unitsDigitEcho = "Eighteen";
                }
                break;
            case '9':
                if (tensDigit == '1') {
                    unitsDigitEcho = "Nineteen";
                } else {
                    unitsDigitEcho = "Nine";
                }
                break;
            default:
                if (tensDigit == '0' && hundredsDigit == '0') {
                    unitsDigitEcho = "Zero";
                } else {
                    unitsDigitEcho = "";
                }
        }
        switch (tensDigit) {
            case '2':
                tensDigitEcho = "Twenty ";
                break;
            case '3':
                tensDigitEcho = "Thirty ";
                break;
            case '4':
                tensDigitEcho = "Forty ";
                break;
            case '5':
                tensDigitEcho = "Fifty ";
                break;
            case '6':
                tensDigitEcho = "Sixty ";
                break;
            case '7':
                tensDigitEcho = "Seventy ";
                break;
            case '8':
                tensDigitEcho = "Eighty ";
                break;
            case '9':
                tensDigitEcho = "Ninety ";
                break;
            default:
                tensDigitEcho = "";
        }
        switch (hundredsDigit) {
            case '1':
                hundredsDigitEcho = "One Hundred and ";
                break;
            case '2':
                hundredsDigitEcho = "Two Hundreds and ";
                break;
            case '3':
                hundredsDigitEcho = "Three Hundreds and ";
                break;
            case '4':
                hundredsDigitEcho = "Four Hundreds and ";
                break;
            case '5':
                hundredsDigitEcho = "Five Hundreds and ";
                break;
            case '6':
                hundredsDigitEcho = "Six Hundreds and ";
                break;
            case '7':
                hundredsDigitEcho = "Seven Hundreds and ";
                break;
            case '8':
                hundredsDigitEcho = "Eight Hundreds and ";
                break;
            case '9':
                hundredsDigitEcho = "Nine Hundreds and ";
                break;
            default:
                hundredsDigitEcho = "";
        }
        if (numberToEcho >= 0 && numberToEcho <= 999) {
            System.out.println(hundredsDigitEcho + tensDigitEcho + unitsDigitEcho);
        }
    }
}
