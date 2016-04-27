package ua.nedz.margo.patterns.creation.singleton;

public class SyncSingleton {

    private static SyncSingleton instance;

    public static synchronized SyncSingleton getInstance() {
        if (instance == null) {
            instance = new SyncSingleton();
        }
        return instance;
    }
}
