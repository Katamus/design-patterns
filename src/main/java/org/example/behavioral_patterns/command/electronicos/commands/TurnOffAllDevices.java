package org.example.behavioral_patterns.command.electronicos.commands;

import org.example.behavioral_patterns.command.electronicos.devices.ElectronicDevice;

import java.util.List;

public class TurnOffAllDevices implements Command{

    List<ElectronicDevice> allDevices;

    public TurnOffAllDevices(List<ElectronicDevice> newDevices) {
        allDevices = newDevices;
    }

    public void execute() {
        for (ElectronicDevice device : allDevices) {
            device.off();
        }
    }

    public void undo() {
        for (ElectronicDevice device : allDevices) {
            device.on();
        }
    }


}
