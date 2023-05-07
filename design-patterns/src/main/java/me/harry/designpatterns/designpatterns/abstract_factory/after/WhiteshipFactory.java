package me.harry.designpatterns.designpatterns.abstract_factory.after;

import me.harry.designpatterns.designpatterns.factory.after.DefaultShipFactory;
import me.harry.designpatterns.designpatterns.factory.after.Ship;
import me.harry.designpatterns.designpatterns.factory.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
