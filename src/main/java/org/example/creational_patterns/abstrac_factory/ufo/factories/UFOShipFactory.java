package org.example.creational_patterns.abstrac_factory.ufo.factories;

import org.example.creational_patterns.abstrac_factory.ufo.parts.*;

public class UFOShipFactory extends ShipFactory{
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOEngine();
    }
}
