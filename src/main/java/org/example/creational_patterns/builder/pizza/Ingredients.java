package org.example.creational_patterns.builder.pizza;

public enum Ingredients {
    PEPPERONI, SALAMI, HAM, MUSHROOMS, PINEAPPLE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
