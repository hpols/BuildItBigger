package com.example.android.javalib;

import java.util.ArrayList;
import java.util.Random;

/**
 * Jokes taken from: https://www.hongkiat.com/blog/programming-jokes/
 */
public class Joker {

    private ArrayList<String> jokes;
    private Random randomJoke;

    public Joker() {
        randomJoke = new Random();

        jokes = new ArrayList<>();
        jokes.add("Programmer (noun)\n\nA machine that turns coffee into code.");
        jokes.add("Programmer (noun)\n\nA person who fixed a problem you didn't know you had.");
        jokes.add("Algorithm (noun)\n\nWord used by a programmer when they do not want to explain what they did.");
        jokes.add("Hardware (noun)\n\nThe part of the computer you can kick");
    }

    public String getJoke() {
        int jokeIndex = randomJoke.nextInt(jokes.size());

        return jokes.get(jokeIndex);
    }
}
