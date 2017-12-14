package _00_DESIGN_PATTERNS._01_COMMAND_PATTERN;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        this.abcStock.sell();
    }
}
