package _03_GenericsLAB._04_ListUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        System.out.println(ListUtils.getMin(nums));
    }
}
