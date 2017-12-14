package _11_LiskovAndOCP_LAB.P01_ExtendedArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiFunction;

public class ExtendedArrayList<T extends Comparable> extends ArrayList<T> implements ExtendedList<T>{

    public static void main(String[] args) {
        ExtendedList e = new ExtendedArrayList();
        e.add(1);
        e.add(2);
        e.add(3);
        e.add(4);
        System.out.println(e.max());
        System.out.println(e.min());
    }

    @Override
    public T max() {
        BiFunction<T, T, Boolean> function = (t1, t2) -> t1.compareTo(t2) < 0;
        return getMaxOrMin(function);
    }

    @Override
    public T min() {
        BiFunction<T, T, Boolean> function = (t1, t2) -> t1.compareTo(t2) > 0;
        return getMaxOrMin(function);
    }

    private T getMaxOrMin( BiFunction<T, T, Boolean> function) {
        T maxOrMin = null;
        Iterator<T> iterator = super.iterator();
        while (iterator.hasNext()) {
            T nextElement = iterator.next();
            if (maxOrMin == null || function.apply(maxOrMin, nextElement)) {
                maxOrMin = nextElement;
            }
        }
        return maxOrMin;
    }
}
