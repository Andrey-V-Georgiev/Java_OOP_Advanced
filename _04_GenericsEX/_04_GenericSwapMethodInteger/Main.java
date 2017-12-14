package _04_GenericsEX._04_GenericSwapMethodInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> nums = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            Box newBox = new Box(Integer.parseInt(bf.readLine()));
            nums.add(newBox.toString());
        }

        String[] tokens = bf.readLine().split(" ");
        int i1 = Integer.parseInt(tokens[0]);
        int i2 = Integer.parseInt(tokens[1]);

        String old = nums.get(i1);
        nums.set(i1, nums.get(i2));
        nums.set(i2, old);

        for (String num : nums) {
            System.out.println(num);
        }
    }
}
