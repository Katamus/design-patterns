package org.example.creational_patterns.abstrac_factory.ufo;

import org.example.creational_patterns.abstrac_factory.ufo.products.Ship;
import org.example.creational_patterns.abstrac_factory.ufo.products.UFOBossShip;
import org.example.creational_patterns.abstrac_factory.ufo.products.UFOShip;

public class ShipsAbstractFactoryTestDrive {
    public static void main(String[] args) {

        Ship ship;
        String typeShip;

        typeShip = "ufo";
        if(typeShip.equalsIgnoreCase("ufo")){
            ship = new UFOShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }

        typeShip = "boss";
        if(typeShip.equalsIgnoreCase("boss")){
            ship = new UFOBossShip();
            ship.makeShip();
            System.out.println(ship.toString());
        }
    }
}
