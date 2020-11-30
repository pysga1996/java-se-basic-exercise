package com.basic.practice.ex2;

import common.Exercise;
import java.util.Scanner;

public class Monetary implements Exercise {

    @Override
    public void start() {
        double USD;
        Scanner input = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        USD = input.nextDouble();
        double VND = USD * 23000;
        System.out.print("Giá trị VND: " + VND);
    }
}
