package org.example.creational_patterns.abstrac_factory.ufo.factories;

import org.example.creational_patterns.abstrac_factory.ufo.parts.ShipEngine;
import org.example.creational_patterns.abstrac_factory.ufo.parts.ShipWeapon;
import org.example.creational_patterns.abstrac_factory.ufo.parts.UFOBossEngine;
import org.example.creational_patterns.abstrac_factory.ufo.parts.UFOBossGun;

public class UFOBossShipFactory extends ShipFactory{
    @Override
    public ShipWeapon makeShipGun() {
        return new UFOBossGun();
    }

    @Override
    public ShipEngine makeShipEngine() {
        return new UFOBossEngine();
    }
}
