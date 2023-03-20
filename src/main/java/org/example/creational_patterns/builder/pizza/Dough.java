package org.example.creational_patterns.builder.pizza;

public enum Dough {

    CROSS, PANBAKED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
