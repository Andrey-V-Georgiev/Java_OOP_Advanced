package _06_IteratorsAndComparatorsEX._02_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class ListyIterator implements Iterable<String> {
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
            throw new Exception("Invalid Operation!");
        } else {
            return list.get(this.listCounter);
        }
    }

    public String PrintAll(){
        return String.join(" ", this.list);
    }

    @Override
    public Iterator<String> iterator() {
        return new Listy();
    }

    private class Listy implements Iterator {
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

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer action) {

        }
    }
}
