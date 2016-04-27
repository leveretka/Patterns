package ua.nedz.margo.patterns.behaviour.observer;

public class Main {

    public static void main(String[] args) {
        ControlledClass c = new ControlledClass();
        ControlClass d = new ImplControlClass();
        ControlClass d1 = new ImplControlClass();
        c.addControlClass(d);
        c.addControlClass(d1);
        c.setValue(100);
    }
}
