package ua.nedz.margo.patterns.creation.prototype;

public class PrototypeFactory {

    private static Infantryman infantryman = new Infantryman();
    private static Archer archer = new Archer();

    public Warrior createInfantryman() {
        return infantryman.clone();
    }

    public Warrior createArcher() {
        return archer.clone();
    }
}
