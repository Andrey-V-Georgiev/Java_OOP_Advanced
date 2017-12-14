package _00_DESIGN_PATTERNS._01_COMMAND_PATTERN;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock  = abcStock;
    }

    @Override
    public void execute() {
        this.abcStock.buy();
    }
}
