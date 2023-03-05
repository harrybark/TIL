package me.harry.designpatterns.designpatterns.singleton;

public class ThreadSafeSettingsInnerSet {

    private ThreadSafeSettingsInnerSet() {
    }

    private static class SettingsHolder {
        private static final ThreadSafeSettingsInnerSet INSTANCE = new ThreadSafeSettingsInnerSet();
    }
    public static ThreadSafeSettingsInnerSet getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
