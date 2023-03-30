package org.example.structural_patterns.composite.cartas;

import java.util.List;

public class Sentence extends LetterComposite{

    public Sentence(List<Word> words) {
        words.forEach(this::add);
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".\n");
    }
}
