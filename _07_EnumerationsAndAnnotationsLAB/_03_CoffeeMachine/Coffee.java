package _07_EnumerationsAndAnnotationsLAB._03_CoffeeMachine;

public class Coffee {
    private CoffeeSize coffeeSize;
    private CoffeeType coffeeType;

    public Coffee(CoffeeSize size, CoffeeType type) {
        this.coffeeSize = size;
        this.coffeeType = type;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.coffeeSize.toString(), this.coffeeType.toString());
    }
}
