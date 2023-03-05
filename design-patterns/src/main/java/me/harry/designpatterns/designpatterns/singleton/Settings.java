package me.harry.designpatterns.designpatterns.singleton;

public class Settings {

    private static Settings INSTANCE = null;
    private Settings() {
    }

    public static Settings getInstance() {
        if ( INSTANCE == null ) {
            INSTANCE = new Settings();
        }
        return INSTANCE;
    }
}
