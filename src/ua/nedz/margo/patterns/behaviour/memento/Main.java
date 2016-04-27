package ua.nedz.margo.patterns.behaviour.memento;

public class Main {

    public static void main(String[] args) {
        BigObject o = new BigObject(10, 20);
        Memento m = o.getMemento();
        o = null;
        BigObject o1 = new BigObject(0, 0);
        o1.setState(m);
    }
}
