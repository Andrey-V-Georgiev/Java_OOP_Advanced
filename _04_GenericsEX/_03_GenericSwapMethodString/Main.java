package _04_GenericsEX._03_GenericSwapMethodString;

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

        String[] tokens = bf.readLine().split(" ");
        int i1 = Integer.parseInt(tokens[0]);
        int i2 = Integer.parseInt(tokens[1]);

        String old = output.get(i1);
        output.set(i1, output.get(i2));
        output.set(i2, old);

        for (String s : output) {
            System.out.println(s);
        }

    }
}
