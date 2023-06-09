package org.example.creational_patterns.abstrac_factory.ufo.products;


import org.example.creational_patterns.abstrac_factory.ufo.parts.ShipEngine;
import org.example.creational_patterns.abstrac_factory.ufo.parts.ShipWeapon;

public abstract class Ship {

    private String name;
    private ShipWeapon shipWeapon;
    private ShipEngine shipEngine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShipWeapon getShipWeapon() {
        return shipWeapon;
    }

    public void setShipWeapon(ShipWeapon shipWeapon) {
        this.shipWeapon = shipWeapon;
    }

    public ShipEngine getShipEngine() {
        return shipEngine;
    }

    public void setShipEngine(ShipEngine shipEngine) {
        this.shipEngine = shipEngine;
    }

    @Override
    public String toString() {
        return "NAME: " + getName() +
                " | ENGINE: "+ shipEngine.getShipEngineInformation() +
                " | WEAPON: " + shipWeapon.getShipWeaponInformation();
    }

    public abstract void makeShip();

}
