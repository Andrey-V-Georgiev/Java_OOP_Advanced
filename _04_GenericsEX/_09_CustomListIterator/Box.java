package _04_GenericsEX._09_CustomListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Box<T extends Comparable<T>> {

    private List<T> storage;

    public Box() {
        this.storage = new ArrayList<>();
    }

    public void add(T element) {
        this.storage.add(element);
    }

    public T remove(int index) {
       return this.storage.remove(index);
    }

    public boolean contains(T element) {
       return this.storage.contains(element);
    }

    public void swap(int i1, int i2) {
        T old = this.storage.get(i1);
        this.storage.set(i1, this.storage.get(i2));
        this.storage.set(i2, old);
    }

    public int countGreaterThan(T element) {
        return (int) this.storage.stream().filter(i-> i.compareTo(element) > 0).count();
    }

    public Optional<T> getMax() {
        return this.storage.stream().max(Comparable::compareTo);
    }

    public Optional<T> getMin() {
        return this.storage.stream().min(Comparable::compareTo);
    }

    public void print(){
        this.storage.forEach(System.out::println);
    }

    public void sort(){
        this.storage.sort(Comparable::compareTo);
    }

}
