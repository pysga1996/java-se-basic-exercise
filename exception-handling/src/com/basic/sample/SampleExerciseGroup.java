package com.basic.sample;

import com.basic.sample.ex1.TriangleExceptionHandling;
import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;

public class SampleExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        exerciseMap.put("1", TriangleExceptionHandling.class);
        return exerciseMap;
    }
}
