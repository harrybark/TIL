package me.harry.designpatterns.designpatterns.structural_patterns.flyweight.after;

public class Client {

    public static void main(String[] args) {
        FontFactory factory = new FontFactory();
        Character c1 = new Character('h', "white", factory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", factory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", factory.getFont("nanum:12"));
    }
}
