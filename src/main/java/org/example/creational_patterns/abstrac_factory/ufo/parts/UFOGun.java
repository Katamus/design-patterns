package org.example.creational_patterns.abstrac_factory.ufo.parts;

public class UFOGun implements ShipWeapon{
    @Override
    public String getShipWeaponInformation() {
        return "20 damage";
    }
}
