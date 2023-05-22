package me.harry.designpatterns.designpatterns.structural_patterns.bridge.after;

import me.harry.designpatterns.designpatterns.structural_patterns.bridge.before.Champion;
import me.harry.designpatterns.designpatterns.structural_patterns.bridge.before.PoolParty아리;

public class App {

    public static void main(String[] args) {

        Champion kda = new 아리(new KDA());
        kda.skillQ();
        kda.skillW();

        Champion poolParty아리 = new 아리(new PoolParty아리());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}
