package _04_GenericsEX._01_GenericBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> output = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            Box newBox = new Box(bf.readLine());
            output.add(newBox.toString());
        }

        for (String s : output) {
            System.out.println(s);
        }
    }
}
