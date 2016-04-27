package ua.nedz.margo.patterns.behaviour.state;

public class StateOn extends State {

    @Override
    public void on(TV tv) {
        System.out.println("tv was switched on");
    }

    @Override
    public void off(TV tv) {
        tv.tvState = new StateOff();
        System.out.println("we switched off tv");
    }

    @Override
    public void change(TV tv) {
        System.out.println("we change channel");

    }
}
