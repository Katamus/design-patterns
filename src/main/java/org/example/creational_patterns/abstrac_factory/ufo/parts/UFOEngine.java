package org.example.creational_patterns.abstrac_factory.ufo.parts;

public class UFOEngine implements  ShipEngine{
    @Override
    public String getShipEngineInformation() {
        return "1000 mph";
    }
}
