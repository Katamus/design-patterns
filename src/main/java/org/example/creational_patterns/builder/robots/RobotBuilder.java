package org.example.creational_patterns.builder.robots;

public interface RobotBuilder {

    public void buildRobotHead();
    public void buildRobotTorso();
    public void buildRobotArms();
    public void buildRobotLegs();
    public Robot getRobot();

}
