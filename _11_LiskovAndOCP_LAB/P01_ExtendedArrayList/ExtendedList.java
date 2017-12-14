package _11_LiskovAndOCP_LAB.P01_ExtendedArrayList;

import java.util.List;

public interface ExtendedList<T> extends List<T> {
    T max();
    T min();
}
