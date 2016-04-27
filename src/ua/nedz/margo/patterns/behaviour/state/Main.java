package ua.nedz.margo.patterns.behaviour.state;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV();
        tv.switchOn();
        tv.changeChannel();
        tv.switchOff();
        tv.changeChannel();
    }
}
