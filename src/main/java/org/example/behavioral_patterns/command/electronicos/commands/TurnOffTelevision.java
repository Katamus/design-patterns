package org.example.behavioral_patterns.command.electronicos.commands;

import org.example.behavioral_patterns.command.electronicos.devices.ElectronicDevice;

public class TurnOffTelevision implements Command {

    private ElectronicDevice device;

    public TurnOffTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
