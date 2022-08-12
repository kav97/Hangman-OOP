package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Dictionary {

    private static final ArrayList<String> animals = new ArrayList<>();

    private static final Random RANDOM = new Random();

    static {
        animals.add("dog");
        animals.add("cat");
        animals.add("duck");
        animals.add("lion");
        animals.add("llama");
        animals.add("crocodile");
        animals.add("alligator");
        animals.add("giraffe");
        animals.add("monkey");
        animals.add("zebra");
        animals.add("horse");
        animals.add("snake");
        animals.add("mouse");
        animals.add("whale");
        animals.add("rhinoceros");
        animals.add("hippopotamus");
        animals.add("tiger");
        animals.add("hyena");
        animals.add("cow");
        animals.add("buffalo");
        animals.add("shark");
        animals.add("sheep");
        animals.add("goat");
        animals.add("antelope");
        animals.add("wolf");
        animals.add("frog");
        animals.add("butterfly");
        animals.add("cheetah");
        animals.add("elephant");
        animals.add("turtle");
        animals.add("kangaroo");
        animals.add("eagle");
        animals.add("skunk");
        animals.add("octopus");
        animals.add("lobster");
        animals.add("dolphin");
        animals.add("penguin");
        animals.add("koala");
        animals.add("jellyfish");
        animals.add("jellyfish");
    }

    public static String getAnimal() {
        return animals.get( RANDOM.nextInt( animals.size()) );
    }

    public static void main(String[] args) {
        System.out.println(getAnimal());
    }
}