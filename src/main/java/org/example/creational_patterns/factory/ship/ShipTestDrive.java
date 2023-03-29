package org.example.creational_patterns.factory.ship;

public class ShipTestDrive {

    public static void main(String[] args) {

        ShipFactory shipFactory = new EnemyShipFactory();
        Ship shipCreated;

        System.out.println("ROCKET: ");
        shipCreated = shipFactory.createShip("rocket");
        if(shipCreated!= null){
            System.out.println(shipCreated.toString());
        }else{
            System.out.println("No ship created.");
        }

        System.out.println("UFO: ");
        shipCreated = shipFactory.createShip("UFO");
        if(shipCreated!= null){
            System.out.println(shipCreated.toString());
        }else{
            System.out.println("No ship created.");
        }
    }
}
