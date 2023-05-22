package me.harry.designpatterns.designpatterns.structural_patterns.bridge.before;

import me.harry.designpatterns.designpatterns.structural_patterns.bridge.after.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();

}
