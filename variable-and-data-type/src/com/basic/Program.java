package com.basic;

import com.basic.practice.PracticeExerciseGroup;
import com.basic.sample.SampleExerciseGroup;
import common.ExerciseGroup;
import common.ExerciseType;

public class Program {

    private static ExerciseGroup exerciseGroup;

    public static void main(String[] args) {
        String menu = checkMode(args);
        exerciseGroup.start(menu);
    }

    private static String checkMode(String[] args) {
        if (args.length > 0 && ExerciseType.PRACTICE.name().equalsIgnoreCase(args[0])) {
            exerciseGroup = new PracticeExerciseGroup();
            return "practice-menu.txt";
        } else {
            exerciseGroup = new SampleExerciseGroup();
            return "sample-menu.txt";
        }
    }

}
