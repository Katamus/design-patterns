package org.example.behavioral_patterns.strategy.robot;

public class RobotTestDrive {

    public static void main(String[] args) {
        Robot roboto = new Robot();
        roboto.setName("Mr. Roboto");
        roboto.setBehavior(new NormalBehavior());

        roboto.move();
    }
}
