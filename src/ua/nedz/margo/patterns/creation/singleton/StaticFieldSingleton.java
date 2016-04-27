package ua.nedz.margo.patterns.creation.singleton;

public class StaticFieldSingleton {

    public static final StaticFieldSingleton instance = new StaticFieldSingleton();
}

// + simple
// + threadsafe
// - not lazy
