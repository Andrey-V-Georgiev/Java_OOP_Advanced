package _08_EnumerationsAndAnnotationsEX._02_CardRank;

public class Main {
    public static void main(String[] args) {
        FourteenRanks[] ranks = FourteenRanks.values();
        System.out.println("Card Ranks:");
        int counter = 0;
        for (FourteenRanks rank : ranks) {
            System.out.println(String.format("Ordinal value: %d; Name value: %s", counter++, rank));
        }
    }
}
