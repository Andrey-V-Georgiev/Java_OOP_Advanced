package _04_GenericsEX._02_GenericBoxOfInteger;

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

        for (String num : nums) {
            System.out.println(num);
        }
    }
}
