package _06_IteratorsAndComparatorsEX._01_ListyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ListyIterator<String> implements Iterable<String> {
    private List<String> list;
    private int listCounter;
    private Iterator<String> iterator;

    public ListyIterator(String... list) {
        this.list = Arrays.asList(list);
        this.iterator = iterator();
    }

    public boolean Move() {
        if (this.iterator.hasNext()) {
            this.iterator.next();
            return true;
        }
        return false;
    }

    public boolean HasNext(){
        if (this.iterator.hasNext()) {
            return true;
        }
        return false;
    }

    public String print() throws Exception {
        if (this.list.size() == 0) {
           // System.out.println("Invalid Operation!");
            throw new Exception("Invalid Operation!");
        } else {
           // System.out.println(list.get(this.listCounter));
            return list.get(this.listCounter);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new Listy();
    }

    private class Listy implements Iterator<String> {
        private int counter;

        public Listy() {
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < list.size()-1;
        }

        @Override
        public String next() {
            listCounter++;
            return list.get(this.counter++);
        }
    }
}
