package _08_EnumerationsAndAnnotationsEX._01_CardSuit;

public class Main {
    public static void main(String[] args) {
        FourSuits[] suits = FourSuits.values();
        System.out.println("Card Suits:");
        int counter = 0;
        for (FourSuits suit : suits) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", counter++, suit));
        }
    }
}
