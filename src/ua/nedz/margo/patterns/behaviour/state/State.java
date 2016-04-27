package ua.nedz.margo.patterns.behaviour.state;

public abstract class State {
    abstract public void on(TV tv);
    abstract public void off(TV tv);
    abstract public void change(TV tv);
}