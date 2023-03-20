package org.example.creational_patterns.builder.heroes;

public enum Weapon {

    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
