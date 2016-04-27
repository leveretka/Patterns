package ua.nedz.margo.patterns.creation.prototype;

public class Archer implements Warrior {

    public Archer(Archer archer) {
    }

    Archer() {
    }

    @Override
    public Warrior clone() {
        return new Archer(this);
    }

    @Override
    public void info() {
        System.out.println("Archer");
    }
}
