package org.example.behavioral_patterns.command.electronicos.devices;

public class Television implements ElectronicDevice{

    private int volume = 0;
    private String name;

    public Television(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println(name + "TV is on");
    }

    @Override
    public void off() {
        System.out.println(name + "TV is off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println(name + "TV Volume at: " + volume);
    }

    @Override
    public void volumenDown() {
        volume--;
        System.out.println(name + "TV Volume at: " + volume);
    }
}
