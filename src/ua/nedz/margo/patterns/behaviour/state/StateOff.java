package ua.nedz.margo.patterns.behaviour.state;

public class StateOff extends State {

    @Override
    public void on(TV tv) {
        tv.tvState = new StateOn();
        System.out.println("tv is switched on");
    }

    @Override
    public void off(TV tv) {
        System.out.println("we switched off tv");
    }

    @Override
    public void change(TV tv) {
        System.out.println("we can't change channel");

    }
}
