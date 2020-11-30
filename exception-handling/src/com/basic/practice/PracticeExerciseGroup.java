package com.basic.practice;

import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;

public class PracticeExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        return exerciseMap;
    }
}
