package me.harry.designpatterns.designpatterns.singleton;

import java.io.Serializable;

public class ThreadSafeSettingsInnerSet implements Serializable {

    private ThreadSafeSettingsInnerSet() {
    }

    private static class SettingsHolder {
        private static final ThreadSafeSettingsInnerSet INSTANCE = new ThreadSafeSettingsInnerSet();
    }
    public static ThreadSafeSettingsInnerSet getInstance() {
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
