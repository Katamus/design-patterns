package org.example.structural_patterns.composite.cartas;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {

    private final List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    /**
     * Print.
     */
    public void print() {
        printThisBefore();
        children.forEach(LetterComposite::print);
        printThisAfter();
    }
}
