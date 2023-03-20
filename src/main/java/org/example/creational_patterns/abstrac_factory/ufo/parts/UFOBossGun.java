package org.example.creational_patterns.abstrac_factory.ufo.parts;

public class UFOBossGun implements ShipWeapon{
    @Override
    public String getShipWeaponInformation() {
        return "50 damage";
    }
}
