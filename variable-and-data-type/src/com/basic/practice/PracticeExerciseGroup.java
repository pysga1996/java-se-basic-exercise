package com.basic.practice;

import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;
import com.basic.practice.ex1.Greeting;
import com.basic.practice.ex2.Monetary;
import com.basic.practice.ex3.NumberNarrator;
import com.basic.practice.ex4.Shapes;
import com.basic.practice.ex5.First20Primes;
import com.basic.practice.ex6.Under100Primes;

public class PracticeExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        exerciseMap.put("1", Greeting.class);
        exerciseMap.put("2", Monetary.class);
        exerciseMap.put("3", NumberNarrator.class);
        exerciseMap.put("4", Shapes.class);
        exerciseMap.put("5", First20Primes.class);
        exerciseMap.put("6", Under100Primes.class);
        return exerciseMap;
    }
}
