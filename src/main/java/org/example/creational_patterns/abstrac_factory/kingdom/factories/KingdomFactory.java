package org.example.creational_patterns.abstrac_factory.kingdom.factories;

import org.example.creational_patterns.abstrac_factory.kingdom.parts.Army;
import org.example.creational_patterns.abstrac_factory.kingdom.parts.Castle;
import org.example.creational_patterns.abstrac_factory.kingdom.parts.King;

public abstract class KingdomFactory {

    public abstract Castle makeCastle();
    public abstract King makeKing();
    public abstract Army makeArmy();

}
