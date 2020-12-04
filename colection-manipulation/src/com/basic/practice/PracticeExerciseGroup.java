package com.basic.practice;

import com.basic.practice.ex1.MyListExample;
import com.basic.practice.ex2.MyLinkedListExample;
import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;

public class PracticeExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        exerciseMap.put("1", MyListExample.class);
        exerciseMap.put("2", MyLinkedListExample.class);
        exerciseMap.put("0", null);
        return exerciseMap;
    }
}
