package org.example.creational_patterns.builder.pizza;

public enum Sauce {

    HOT, MILD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
