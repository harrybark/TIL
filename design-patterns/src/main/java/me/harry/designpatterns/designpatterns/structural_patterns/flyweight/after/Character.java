package me.harry.designpatterns.designpatterns.structural_patterns.flyweight.after;

public class Character {

    char value;

    String  color;

    Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
