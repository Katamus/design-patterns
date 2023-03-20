package org.example.creational_patterns.abstrac_factory.kingdom.factories;

import org.example.creational_patterns.abstrac_factory.kingdom.parts.*;

public class ElfKingdomFactory extends KingdomFactory{
    @Override
    public Castle makeCastle() {
        return new ElfCastle();
    }

    @Override
    public King makeKing() {
        return new ElfKing();
    }

    @Override
    public Army makeArmy() {
        return new ElfArmy();
    }
}
