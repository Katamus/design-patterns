package org.example.behavioral_patterns.command.electronicos.commands;

import org.example.behavioral_patterns.command.electronicos.devices.ElectronicDevice;

public class TurnOnTelevision  implements Command{
    private ElectronicDevice device;

    public TurnOnTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
