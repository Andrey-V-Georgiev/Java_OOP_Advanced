package _04_GenericsEX._10_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = bf.readLine().split(" ");
        Tuple<?,?> first = new Tuple<>(firstLine[0] + " " + firstLine[1], firstLine[2]);
        System.out.println(first.toString());
        String[] secondLine = bf.readLine().split(" ");
        Tuple<?,?> second = new Tuple<>(secondLine[0] , Integer.parseInt(secondLine[1]));
        System.out.println(second.toString());
        String[] thirdLine = bf.readLine().split(" ");
        Tuple<?,?> third = new Tuple<>(thirdLine[0] , Double.parseDouble(thirdLine[1]));
        System.out.println(third.toString());
    }
}
