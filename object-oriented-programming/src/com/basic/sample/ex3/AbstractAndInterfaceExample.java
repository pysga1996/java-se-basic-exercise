package com.basic.sample.ex3;

import com.basic.sample.ex3.animal.Animal;
import com.basic.sample.ex3.animal.Chicken;
import com.basic.sample.ex3.animal.Tiger;
import com.basic.sample.ex3.edible.Edible;
import com.basic.sample.ex3.fruit.Apple;
import com.basic.sample.ex3.fruit.Fruit;
import com.basic.sample.ex3.fruit.Orange;
import common.Exercise;

public class AbstractAndInterfaceExample implements Exercise {

    @Override
    public void start() {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
