package ua.nedz.margo.patterns.behaviour.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyArray implements Iterable {

    List l = new ArrayList();

    public MyArray() {
    }

    public void add (int element) {
        l.add(element);
    }

    class ArrayIterator implements Iterator {

        int current = -1;

        @Override
        public boolean hasNext() {
            if (current < l.size() - 1) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Integer next() {
            current++;
            return (Integer) l.get(current);
        }

    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator();
    }

}