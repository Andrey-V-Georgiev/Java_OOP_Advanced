package _08_EnumerationsAndAnnotationsEX._04_CardToString;

public class Card {
    private int cardPower;
    private RankPowers rankPower;
    private SuitPowers suitPower;

    public Card(RankPowers power, SuitPowers suit) {
        this.setPower(power, suit);
    }

    public int getCardPower() {
        return this.cardPower;
    }

    public RankPowers getRankPower() {
        return this.rankPower;
    }

    public SuitPowers getSuitPower() {
        return this.suitPower;
    }

    private void setPower(RankPowers power, SuitPowers suit) {
        this.rankPower = power;
        this.suitPower = suit;
        this.cardPower = power.getRank() + suit.getSuit();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.getRankPower(), this.getSuitPower(), this.getCardPower());
    }
}
