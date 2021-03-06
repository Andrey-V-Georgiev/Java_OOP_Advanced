package _06_IteratorsAndComparatorsEX._06_StrategyPattern;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        int lengthDiff = Integer.compare(p1.getName().length(), p2.getName().length());
        if (lengthDiff == 0) {
            return Character.compare(p1.getName().toLowerCase().charAt(0), p2.getName().toLowerCase().charAt(0));
        }
        return lengthDiff;
    }
}
