package CommandPattern.Example;

public class SellStock implements  Order{
    private Stock absStock ;

    public SellStock(Stock absStock) {
        this.absStock = absStock;
    }
    @Override
    public void Execute() {
        absStock.Sell();
    }

}
