package org.example.structural_patterns.composite.cartas;

import java.util.List;

public class Word extends LetterComposite{

    /**
     * Constructor.
     */
    public Word(List<Letter> letters) {
        letters.forEach(this::add);
    }

    /**
     * Constructor.
     * @param letters to include
     */
    public Word(char... letters) {
        for (char letter : letters) {
            this.add(new Letter(letter));
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }

}
