package _06_IteratorsAndComparatorsEX._05_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();
        String input = bf.readLine();
        while (!"END".equals(input)) {
            String[] tokens = input.split(" ");
            Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            people.add(person);
            input = bf.readLine();
        }

        Person comparedPerson = people.get(Integer.parseInt(bf.readLine()) - 1);
        int numEqual = 0;
        int numUnEqual = 0;
        for (Person person : people) {
            if(person.compareTo(comparedPerson) == 0){
                numEqual++;
            } else {
                numUnEqual++;
            }
        }

        String output = numEqual > 1 ? String.format("%d %d %d", numEqual, numUnEqual, people.size()) : "No matches";

        System.out.println(output);
    }
}
