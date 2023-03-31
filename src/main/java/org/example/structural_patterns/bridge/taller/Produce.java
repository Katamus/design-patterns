package org.example.structural_patterns.bridge.taller;

public class Produce implements Workshop {

    @Override
    public void work() {
        System.out.print("Produced");
    }
}
