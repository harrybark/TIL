package me.harry.designpatterns.designpatterns.factory.after;

public class BlackShipFactory extends DefaultShipFactory{

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
