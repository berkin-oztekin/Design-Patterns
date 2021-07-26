package CommandPattern.Example;

public class BuyStock implements Order{
    private Stock abcStock ;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void Execute() {
        abcStock.Buy();
    }
}
