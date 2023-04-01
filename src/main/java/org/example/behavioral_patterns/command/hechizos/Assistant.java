package org.example.behavioral_patterns.command.hechizos;

import org.example.behavioral_patterns.command.hechizos.commands.Age;
import org.example.behavioral_patterns.command.hechizos.commands.Size;
import org.example.behavioral_patterns.command.hechizos.commands.Visibility;

public class Assistant  extends Target {

    public Assistant() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
        setAge(Age.ADULT);
    }

    @Override
    public String toString() {
        return "Assistant";
    }

}
