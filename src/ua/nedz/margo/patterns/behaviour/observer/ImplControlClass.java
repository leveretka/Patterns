package ua.nedz.margo.patterns.behaviour.observer;

class ImplControlClass implements ControlClass {

    @Override
    public void note(int value) {
        System.out.println("New value is " + value);
    }

}