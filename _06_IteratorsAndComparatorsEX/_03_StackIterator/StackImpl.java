package _06_IteratorsAndComparatorsEX._03_StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class StackImpl implements Stack, Iterable<Integer> {
    private List<Integer> stack;
    private int counter;

    public StackImpl(Integer... nums) {
        this.stack = new ArrayList<>();
        this.counter = 0;
    }

    @Override
    public void push(List<Integer> nums) {
        this.stack.addAll(nums);
    }

    @Override
    public void pop() {
       if(this.stack.size() > 0){
           this.stack.remove(this.stack.size()-1);
       } else {
           System.out.println("No elements");
       }
    }

    @Override
    public String print() {
        List<Integer> printList = new ArrayList<>();
        printList.addAll(this.stack);
        printList.addAll(this.stack);
        StringBuilder sb = new StringBuilder();
        for (int i = printList.size() -1; i >=0 ; i--) {
            sb.append(printList.get(i)).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new stackIterator();
    }

    private class stackIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < stack.size() - 1;
        }

        @Override
        public Integer next() {
            counter++;
            return stack.get(this.index++);
        }
    }
}
