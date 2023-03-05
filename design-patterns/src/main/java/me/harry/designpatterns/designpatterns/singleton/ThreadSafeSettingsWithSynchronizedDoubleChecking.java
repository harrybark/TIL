package me.harry.designpatterns.designpatterns.singleton;

public class ThreadSafeSettingsWithSynchronizedDoubleChecking {

    private static volatile ThreadSafeSettingsWithSynchronizedDoubleChecking INSTANCE ;
    private ThreadSafeSettingsWithSynchronizedDoubleChecking() {
    }

    public static ThreadSafeSettingsWithSynchronizedDoubleChecking getInstance() {
        if ( INSTANCE == null ) {
            synchronized (Settings.class) {
                if ( INSTANCE == null ) {
                    INSTANCE = new ThreadSafeSettingsWithSynchronizedDoubleChecking();
                }
            }
        }
        return INSTANCE;
    }
}
