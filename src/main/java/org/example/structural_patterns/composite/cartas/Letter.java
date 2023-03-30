package org.example.structural_patterns.composite.cartas;

public class Letter extends LetterComposite{

    private final char character;

    public Letter(char character) {
        this.character = character;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(character);
    }
}
