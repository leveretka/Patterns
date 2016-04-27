package ua.nedz.margo.patterns.creation.prototype;

public class Infantryman implements Warrior {

    public Infantryman(Infantryman infantryman) {

    }

    Infantryman() {
    }

    @Override
    public Warrior clone() {
        return new Infantryman(this);
    }

    @Override
    public void info() {
        System.out.println("Infantryman");
    }
}
