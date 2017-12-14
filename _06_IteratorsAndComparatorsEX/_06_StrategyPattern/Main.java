package _06_IteratorsAndComparatorsEX._06_StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Set<Person> byName = new TreeSet<>(new ComparatorByName());
        Set<Person> byAge = new TreeSet<>(new ComparatorByAge());

        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = bf.readLine().split(" ");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]));
            byName.add(person);
            byAge.add(person);
        }

        byName.forEach(System.out::println);
        byAge.forEach(System.out::println);
    }
}
