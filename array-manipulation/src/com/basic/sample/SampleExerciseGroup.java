package com.basic.sample;

import com.basic.sample.ex1.FindElementInArray;
import com.basic.sample.ex2.MinValueElement;
import com.basic.sample.ex3.MaxValueElement;
import com.basic.sample.ex4.ReverseArray;
import com.basic.sample.ex5.ArrayIndexOutOfBoundExample;
import com.basic.sample.ex6.PassedStudents;
import com.basic.sample.ex7.MineSweeperMap;
import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;

public class SampleExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        exerciseMap.put("1", FindElementInArray.class);
        exerciseMap.put("2", MinValueElement.class);
        exerciseMap.put("3", MaxValueElement.class);
        exerciseMap.put("4", ReverseArray.class);
        exerciseMap.put("5", ArrayIndexOutOfBoundExample.class);
        exerciseMap.put("6", PassedStudents.class);
        exerciseMap.put("7", MineSweeperMap.class);
        return exerciseMap;
    }
}
