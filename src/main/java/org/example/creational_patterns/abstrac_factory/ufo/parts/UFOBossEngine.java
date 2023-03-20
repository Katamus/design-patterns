package org.example.creational_patterns.abstrac_factory.ufo.parts;

public class UFOBossEngine implements ShipEngine{
    @Override
    public String getShipEngineInformation() {
        return "5000 mph";
    }
}
