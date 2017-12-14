package _04_GenericsEX._05_GenericCountMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> items = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
           items.add(bf.readLine());
        }
        String test = bf.readLine();
        System.out.println(countBigger(items, test));
    }

    public static <T extends Comparable<T>> long countBigger(List<T> list, T element){
       return  list.stream().filter(i-> i.compareTo(element) > 0).count();
    }
}
