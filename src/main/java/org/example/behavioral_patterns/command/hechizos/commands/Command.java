package org.example.behavioral_patterns.command.hechizos.commands;


import org.example.behavioral_patterns.command.hechizos.Target;

public abstract class Command {
    public abstract void execute(Target target);
    public abstract void undo();
    public abstract void redo();

    @Override
    public abstract String toString();

}
