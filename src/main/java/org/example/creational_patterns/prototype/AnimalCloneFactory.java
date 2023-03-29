package org.example.creational_patterns.prototype;

public class AnimalCloneFactory {

    public Animal getClone(Animal animalSample) {
        return animalSample.clone();
    }
}
