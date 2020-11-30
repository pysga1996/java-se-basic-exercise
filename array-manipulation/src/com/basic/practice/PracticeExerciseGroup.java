package com.basic.practice;

import com.basic.practice.ex1.MinValueElement;
import com.basic.practice.ex2.MaxValueInTwoDimensionsArray;
import com.basic.practice.ex3.AddElementToArray;
import com.basic.practice.ex4.RemoveElementFromArray;
import com.basic.practice.ex5.CombineTwoArrays;
import com.basic.practice.ex6.CharacterAppearancesInStringCount;
import com.basic.practice.ex7.ElementsOnAColumnSum;
import com.basic.practice.ex8.ElementsOnDiagonalLinesSum;
import common.Exercise;
import common.ExerciseGroup;
import java.util.HashMap;
import java.util.Map;

public class PracticeExerciseGroup extends ExerciseGroup {

    @Override
    public Map<String, Class<? extends Exercise>> initExerciseMap() {
        Map<String, Class<? extends Exercise>> exerciseMap = new HashMap<>();
        exerciseMap.put("1", MinValueElement.class);
        exerciseMap.put("2", MaxValueInTwoDimensionsArray.class);
        exerciseMap.put("3", AddElementToArray.class);
        exerciseMap.put("4", RemoveElementFromArray.class);
        exerciseMap.put("5", CombineTwoArrays.class);
        exerciseMap.put("6", CharacterAppearancesInStringCount.class);
        exerciseMap.put("7", ElementsOnAColumnSum.class);
        exerciseMap.put("8", ElementsOnDiagonalLinesSum.class);
        return exerciseMap;
    }
}
