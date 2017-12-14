package _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.classes;

import _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.interfaces.AddRemoveInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddRemoveCollection implements AddRemoveInterface {
    private Deque<String> deque;

    public AddRemoveCollection() {
        this.deque = new ArrayDeque<>();
    }

    @Override
    public String add(String item) {
        this.deque.addFirst(item);
        return "0";
    }

    @Override
    public String remove() {
       return this.deque.removeLast();
    }
}
