package org.example.creational_patterns.factory.ship;

public class EnemyShipFactory implements ShipFactory{
    @Override
    public Ship createShip(String shipType) {
        Ship ship = null;

        if(shipType.equalsIgnoreCase("rocket")){
            ship = new RocketShip();
        }else if(shipType.equalsIgnoreCase("ufo")){
            ship = new UFOShip();
        }

        return ship;
    }
}
