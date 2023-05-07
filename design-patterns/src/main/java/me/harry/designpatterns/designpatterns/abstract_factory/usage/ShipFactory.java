package me.harry.designpatterns.designpatterns.abstract_factory.usage;

import me.harry.designpatterns.designpatterns.factory.after.Ship;
import me.harry.designpatterns.designpatterns.factory.after.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
