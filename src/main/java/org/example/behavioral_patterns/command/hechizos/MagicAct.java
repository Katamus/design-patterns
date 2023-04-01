package org.example.behavioral_patterns.command.hechizos;

import org.example.behavioral_patterns.command.hechizos.commands.AgeSpell;
import org.example.behavioral_patterns.command.hechizos.commands.InvisibilitySpell;
import org.example.behavioral_patterns.command.hechizos.commands.ShrinkSpell;

public class MagicAct {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Assistant assistant = new Assistant();

        assistant.printStatus();

        wizard.castSpell(new ShrinkSpell(), assistant);
        assistant.printStatus();

        wizard.castSpell(new InvisibilitySpell(), assistant);
        assistant.printStatus();

        wizard.undoLastSpell();
        assistant.printStatus();

        wizard.undoLastSpell();
        assistant.printStatus();

        wizard.redoLastSpell();
        assistant.printStatus();

        wizard.redoLastSpell();
        assistant.printStatus();

        ///Add a new spell
        wizard.castSpell(new AgeSpell(), assistant);
        assistant.printStatus();
    }
}
