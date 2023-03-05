package me.harry.designpatterns.designpatterns.singleton;

public class ThreadSafeSettings {

    private static final ThreadSafeSettings INSTANCE = new ThreadSafeSettings();
    private ThreadSafeSettings() {
    }

    public static synchronized ThreadSafeSettings getInstance() {
        return INSTANCE;
    }
}
