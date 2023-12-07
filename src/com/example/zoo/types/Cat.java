package com.example.zoo.types;

import com.example.zoo.Animal;

public class Cat extends Animal implements Relaxer {
    @Override
    public void sound() {
        System.out.println("Meow...");
    }
}
