package org.example.behavioral_patterns.strategy.transportation;

public class CityBus implements  TransportationMode{
    @Override
    public String travel() {
        return "Traveling to Airport in: CityBus";
    }
}
