package org.example.behavioral_patterns.mediator.air_traffic_controller;

public class ControlTower {

    private Flight flight;
    private Runway runway;
    public boolean land;

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isLandingOk() {
        return land;
    }

    public void setLandingStatus(boolean status) {
        land = status;
    }

}
