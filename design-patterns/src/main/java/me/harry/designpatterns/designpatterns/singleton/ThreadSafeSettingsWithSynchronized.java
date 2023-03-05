package me.harry.designpatterns.designpatterns.singleton;

public class ThreadSafeSettingsWithSynchronized {

    private static ThreadSafeSettingsWithSynchronized INSTANCE = null;
    private ThreadSafeSettingsWithSynchronized() {
    }

    public static synchronized ThreadSafeSettingsWithSynchronized getInstance() {
        if ( INSTANCE == null ) {
            INSTANCE = new ThreadSafeSettingsWithSynchronized();
        }
        return INSTANCE;
    }
}
