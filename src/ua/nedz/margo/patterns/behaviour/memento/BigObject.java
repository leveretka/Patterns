package ua.nedz.margo.patterns.behaviour.memento;

class BigObject {
    int a;
    int b;
    int c;

    public BigObject (int a, int b) {
        this.a = a;
        this.b = b;
        this.c = a + b;
    }

    public Memento getMemento() {
        Memento m = new Memento();
        m.setA(a);
        m.setB(b);
        return m;
    }

    public void setState(Memento m) {
        this.a = m.getA();
        this.b = m.getB();
        this.c = a + b;
    }
}