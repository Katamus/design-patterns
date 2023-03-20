package org.example.creational_patterns.abstrac_factory.ufo.products;

import org.example.creational_patterns.abstrac_factory.ufo.factories.ShipFactory;
import org.example.creational_patterns.abstrac_factory.ufo.factories.UFOBossShipFactory;

public class UFOBossShip extends Ship{
    private ShipFactory shipFactory;

    public UFOBossShip() {
        setName("UFO Boss Ship");
        this.shipFactory = new UFOBossShipFactory();
    }


    @Override
    public void makeShip() {
        System.out.println("Making new " + getName());
        setShipEngine(shipFactory.makeShipEngine());
        setShipWeapon(shipFactory.makeShipGun());
    }
}
