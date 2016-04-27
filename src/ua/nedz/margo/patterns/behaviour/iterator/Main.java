package ua.nedz.margo.patterns.behaviour.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyArray a = new MyArray();
        a.add(10);
        a.add(20);
        a.add(30);
        for (Object i : a) {
            System.out.println((Integer)i);
        }
        Object i = null;
        for (Iterator it = a.iterator(); it.hasNext(); i = it.next()) {
            System.out.println((Integer)i);
        }
    }
}
