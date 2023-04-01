package org.example.behavioral_patterns.command.electronicos.commands;

import org.example.behavioral_patterns.command.electronicos.devices.ElectronicDevice;

public class VolumeDownTelevision implements Command {

    private ElectronicDevice device;

    public VolumeDownTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumenDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }

}
