package _00_DESIGN_PATTERNS._01_COMMAND_PATTERN;

public class CommandPattern {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
