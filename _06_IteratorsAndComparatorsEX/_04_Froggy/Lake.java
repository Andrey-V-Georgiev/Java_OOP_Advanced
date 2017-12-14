package _06_IteratorsAndComparatorsEX._04_Froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable, ILake {
    private List<Integer> nums;

    public Lake(List<Integer> list) {
        this.nums = new ArrayList<>(list);
    }

    @Override
    public Iterator iterator() {
        return new Frog();
    }

    @Override
    public String resultString() {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                resultList.add(nums.get(i).toString());
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                resultList.add(nums.get(i).toString());
            }
        }
        return String.join(", ", resultList);
    }

    private class Frog implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return this.index < nums.size() - 1;
        }

        @Override
        public Object next() {
            return nums.get(index++);
        }
    }
}
