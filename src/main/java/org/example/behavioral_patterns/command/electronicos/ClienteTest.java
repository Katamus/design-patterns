package org.example.behavioral_patterns.command.electronicos;

import org.example.behavioral_patterns.command.electronicos.commands.TurnOffAllDevices;
import org.example.behavioral_patterns.command.electronicos.commands.TurnOffTelevision;
import org.example.behavioral_patterns.command.electronicos.commands.TurnOnTelevision;
import org.example.behavioral_patterns.command.electronicos.commands.VolumeUpTelevision;
import org.example.behavioral_patterns.command.electronicos.devices.ElectronicDevice;
import org.example.behavioral_patterns.command.electronicos.devices.Radio;
import org.example.behavioral_patterns.command.electronicos.devices.Television;

import java.util.ArrayList;
import java.util.List;

public class ClienteTest {

    public static void main(String[] args){

        ElectronicDevice televisionOne = new Television("SAMSUMG");

        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        onPressed.press();


        TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        Television televisionTwo = new Television("SONY");
        Radio radioOne = new Radio("PIONEER");

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(televisionTwo);
        allDevices.add(radioOne);

        TurnOffAllDevices turnOffDevices = new TurnOffAllDevices(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();

    }
}
