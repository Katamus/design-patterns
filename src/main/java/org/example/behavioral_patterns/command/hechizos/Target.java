package org.example.behavioral_patterns.command.hechizos;

import org.example.behavioral_patterns.command.hechizos.commands.Age;
import org.example.behavioral_patterns.command.hechizos.commands.Size;
import org.example.behavioral_patterns.command.hechizos.commands.Visibility;

public abstract class Target {

    private Size size;
    private Visibility visibility;
    private Age age;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    @Override
    public abstract String toString();

    public void printStatus() {
        System.out.println(String.format("%s, Size: %s | Visibility: %s | Age: %s \n", this,
                getSize(), getVisibility(), getAge()));
    }
}
