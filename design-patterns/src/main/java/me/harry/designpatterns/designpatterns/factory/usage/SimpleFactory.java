package me.harry.designpatterns.designpatterns.factory.usage;

import me.harry.designpatterns.designpatterns.factory.after.Blackship;
import me.harry.designpatterns.designpatterns.factory.after.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if ( name.equals("whiteship")) {
            return new Whiteship();
        } else if ( name.equals("blackship")) {
            return  new Blackship();
        }

        throw new IllegalArgumentException("");
    }
}
