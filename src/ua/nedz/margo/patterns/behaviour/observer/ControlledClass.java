package ua.nedz.margo.patterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class ControlledClass {
    int value;
    List<ControlClass> l = new ArrayList();

    public void setValue(int value) {
        this.value = value;
        for (ControlClass c: l) {
            c.note(value);
        }
    }

    public void addControlClass(ControlClass c) {
        l.add(c);
    }

    public void removeControlClass(ControlClass c) {
        l.remove(c);
    }
}
