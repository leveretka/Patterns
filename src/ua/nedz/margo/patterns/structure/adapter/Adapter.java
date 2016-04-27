package ua.nedz.margo.patterns.structure.adapter;

public class Adapter implements Contract {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
