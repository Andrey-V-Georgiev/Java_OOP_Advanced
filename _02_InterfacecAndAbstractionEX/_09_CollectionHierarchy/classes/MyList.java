package _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.classes;

import _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.interfaces.MyListInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyList implements MyListInterface {
    private Deque<String> deque;

    public MyList() {
        this.deque = new ArrayDeque<>();
    }

    @Override
    public String used() {
        return "" + this.deque.size();
    }

    @Override
    public String remove() {
       return this.deque.removeFirst();
    }

    @Override
    public String add(String item) {
        this.deque.addFirst(item);
        return "0";
    }
}
