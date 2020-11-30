package com.basic.sample;

import com.basic.sample.ex1.RectangleExample;
import com.basic.sample.ex2.ShapeAndTriangleExample;
import com.basic.sample.ex3.AbstractAndInterfaceExample;
import com.basic.sample.ex4.ComparableExample;
import com.basic.sample.ex5.ComparatorExample;
import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;

public class SampleExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        exerciseMap.put("1", RectangleExample.class);
        exerciseMap.put("2", ShapeAndTriangleExample.class);
        exerciseMap.put("3", AbstractAndInterfaceExample.class);
        exerciseMap.put("4", ComparableExample.class);
        exerciseMap.put("5", ComparatorExample.class);
        return exerciseMap;
    }
}
