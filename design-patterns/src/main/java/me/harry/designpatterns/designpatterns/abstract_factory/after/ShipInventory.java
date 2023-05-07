package me.harry.designpatterns.designpatterns.abstract_factory.after;

import me.harry.designpatterns.designpatterns.factory.after.Ship;
import me.harry.designpatterns.designpatterns.factory.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
