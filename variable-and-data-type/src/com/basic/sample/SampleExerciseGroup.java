package com.basic.sample;

import com.basic.sample.ex12.Temperature;
import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;
import com.basic.sample.ex1.Variables;
import com.basic.sample.ex10.Interest;
import com.basic.sample.ex11.GreatestCommonDivisor;
import com.basic.sample.ex2.Operators;
import com.basic.sample.ex3.SystemTime;
import com.basic.sample.ex4.Menu;
import com.basic.sample.ex5.LinearEquationResolver;
import com.basic.sample.ex6.Prime;
import com.basic.sample.ex7.LeapYear;
import com.basic.sample.ex8.Weight;
import com.basic.sample.ex9.Days;

public class SampleExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        exerciseMap.put("1", Variables.class);
        exerciseMap.put("2", Operators.class);
        exerciseMap.put("3", SystemTime.class);
        exerciseMap.put("4", Menu.class);
        exerciseMap.put("5", LinearEquationResolver.class);
        exerciseMap.put("6", Prime.class);
        exerciseMap.put("7", LeapYear.class);
        exerciseMap.put("8", Weight.class);
        exerciseMap.put("9", Days.class);
        exerciseMap.put("10", Interest.class);
        exerciseMap.put("11", GreatestCommonDivisor.class);
        exerciseMap.put("12", Temperature.class);
        exerciseMap.put("0", null);
        return exerciseMap;
    }
}
