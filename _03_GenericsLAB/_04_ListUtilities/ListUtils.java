package _03_GenericsLAB._04_ListUtilities;

import java.util.List;

public class ListUtils {

    public ListUtils(){
    }

    public static <T extends Comparable<T>> T getMin(List<T> list){
        if(list.size() == 0){
              throw new IllegalArgumentException();
        } else {
            T min = list.get(0);
            for (T t : list) {
                if(min.compareTo(t) > 0){
                    min = t;
                }
            }
            return min;
        }

    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if(list.size() == 0){
            throw new IllegalArgumentException();
        } else {
            T max = list.get(0);
            for (T t : list) {
                if(max.compareTo(t) < 0){
                    max = t;
                }
            }
            return max;
        }
    }
}
