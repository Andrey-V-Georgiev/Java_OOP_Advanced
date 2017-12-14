package _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.classes;

import _02_InterfacecAndAbstractionEX._09_CollectionHierarchy.interfaces.AddInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddCollection implements AddInterface{
    private Deque<String> deque;

    public AddCollection(){
        this.deque = new ArrayDeque<>();
    }

    @Override
    public String add(String item) {
        this.deque.add(item);
        return "" + (this.deque.size() - 1);
    }
}
