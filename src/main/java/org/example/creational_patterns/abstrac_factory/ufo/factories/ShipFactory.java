package org.example.creational_patterns.abstrac_factory.ufo.factories;

import org.example.creational_patterns.abstrac_factory.ufo.parts.ShipEngine;
import org.example.creational_patterns.abstrac_factory.ufo.parts.ShipWeapon;

public abstract  class ShipFactory {

    public abstract ShipWeapon makeShipGun();
    public abstract ShipEngine makeShipEngine();
}
