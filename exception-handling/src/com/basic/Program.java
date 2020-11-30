package com.basic;

import com.basic.practice.PracticeExerciseGroup;
import com.basic.sample.SampleExerciseGroup;
import common.ExerciseGroup;

public class Program {

    public static void main(String[] args) throws ReflectiveOperationException {
        ExerciseGroup exerciseGroup = ExerciseGroup
            .initExerciseGroup(args, SampleExerciseGroup.class, PracticeExerciseGroup.class);
        exerciseGroup.start();
    }

}
