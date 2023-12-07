package com.example.zoo.types;

import com.example.zoo.Animal;

public class Dog extends Animal implements Protector {
    @Override
    public void sound() {
        System.out.println("Bark!!!");
    }
}
