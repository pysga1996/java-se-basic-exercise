package com.basic.practice;

import com.basic.practice.ex1.FanExample;
import com.basic.practice.ex2.QuadraticEquationExample;
import com.basic.practice.ex3.StopWatchExample;
import com.basic.practice.ex5.CircleAndCylinderExample;
import com.basic.practice.ex6.PointAndMovablePointTest;
import com.basic.practice.ex7.Point2DAndPoint3DExample;
import com.basic.practice.ex4.ShapeAndTriangleExample;
import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;

public class PracticeExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        exerciseMap.put("1", FanExample.class);
        exerciseMap.put("2", QuadraticEquationExample.class);
        exerciseMap.put("3", StopWatchExample.class);
        exerciseMap.put("4", ShapeAndTriangleExample.class);
        exerciseMap.put("5", CircleAndCylinderExample.class);
        exerciseMap.put("6", PointAndMovablePointTest.class);
        exerciseMap.put("7", Point2DAndPoint3DExample.class);
        return exerciseMap;
    }
}
