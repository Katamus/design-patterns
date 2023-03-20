package org.example.creational_patterns.abstrac_factory.kingdom;

import org.example.creational_patterns.abstrac_factory.kingdom.factories.ElfKingdomFactory;
import org.example.creational_patterns.abstrac_factory.kingdom.factories.KingdomFactory;
import org.example.creational_patterns.abstrac_factory.kingdom.factories.MenKingdomFactory;
import org.example.creational_patterns.abstrac_factory.kingdom.parts.Army;
import org.example.creational_patterns.abstrac_factory.kingdom.parts.Castle;
import org.example.creational_patterns.abstrac_factory.kingdom.parts.King;

public class KingdomTestDrive {

    public static void main(String[] args) {
        createKingdom(new ElfKingdomFactory());
        createKingdom(new MenKingdomFactory());
    }

    public static void createKingdom(KingdomFactory factory) {
        King king = factory.makeKing();
        Castle castle = factory.makeCastle();
        Army army = factory.makeArmy();
        System.out.println("The kingdom was created: ");
        System.out.println(king);
        System.out.println(castle);
        System.out.println(army);
    }
}
