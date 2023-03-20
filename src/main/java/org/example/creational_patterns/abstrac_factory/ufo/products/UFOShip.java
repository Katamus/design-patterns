package org.example.creational_patterns.abstrac_factory.ufo.products;

import org.example.creational_patterns.abstrac_factory.ufo.factories.ShipFactory;
import org.example.creational_patterns.abstrac_factory.ufo.factories.UFOBossShipFactory;
import org.example.creational_patterns.abstrac_factory.ufo.factories.UFOShipFactory;

public class UFOShip extends Ship{
    private ShipFactory shipFactory;

    public UFOShip() {
        setName("UFO Boss Ship");
        this.shipFactory = new UFOShipFactory();
    }


    @Override
    public void makeShip() {
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }
}
