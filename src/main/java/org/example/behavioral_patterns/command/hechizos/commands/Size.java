package org.example.behavioral_patterns.command.hechizos.commands;

public enum Size {

    SMALL("small"), NORMAL("normal"), LARGE("large"), UNDEFINED("");

    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
