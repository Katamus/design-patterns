package org.example.behavioral_patterns.visitor.airportsecuritycontrol;

public interface Passenger {
    boolean accept(PoliceOfficer visitor);
}
