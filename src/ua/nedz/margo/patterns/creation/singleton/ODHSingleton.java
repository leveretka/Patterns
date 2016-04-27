package ua.nedz.margo.patterns.creation.singleton;

public class ODHSingleton {

    public static class SingletonHolder {
        public static final ODHSingleton HOLDER_INSTANCE = new ODHSingleton();
    }

    public static ODHSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
