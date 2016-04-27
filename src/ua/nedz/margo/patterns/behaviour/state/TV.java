package ua.nedz.margo.patterns.behaviour.state;

public class TV {

    State tvState;

    public TV() {
        tvState = new StateOff();
    }

    public void switchOn() {
        tvState.on(this);
    }

    public void switchOff() {
        tvState.off(this);
    }

    public void changeChannel() {
        tvState.change(this);
    }
}