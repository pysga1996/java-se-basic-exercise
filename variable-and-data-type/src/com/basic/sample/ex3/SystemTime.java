package com.basic.sample.ex3;

import common.Exercise;
import java.util.Date;

public class SystemTime implements Exercise {

    @Override
    public void start() {
        Date now = new Date();

        System.out.println("Now is: " + now);
    }
}
