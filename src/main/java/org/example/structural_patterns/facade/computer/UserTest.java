package org.example.structural_patterns.facade.computer;

public class UserTest {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
