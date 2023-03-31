package org.example.structural_patterns.bridge.taller;

public class Assemble implements Workshop{
    @Override
    public void work() {
        System.out.print(" And");
        System.out.println(" Assembled.");
    }
}
