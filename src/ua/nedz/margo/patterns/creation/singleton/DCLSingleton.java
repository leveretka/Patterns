package ua.nedz.margo.patterns.creation.singleton;

public class DCLSingleton {
    private static volatile DCLSingleton instance;

    public static DCLSingleton getInstance() {
        DCLSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DCLSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DCLSingleton();
                }
            }
        }
        return localInstance;
    }
}

// java 1.5+ only
