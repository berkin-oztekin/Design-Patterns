package Observer;

public class Investor implements Observer {
    private Stock _stock ;
    private String _investorName ;
    private String _stock_name ; //Internal observer State
    private double _stock_price ; // Internal observer State

    public Investor(String name) {
        _investorName = name;
    }

    @Override
    public void Update(Stock stock) {
        _stock = stock ;
        _stock_name = stock.get_symbol();
        _stock_price = stock.get_price();
        System.out.println("Notified " + _investorName + " of " + _stock_name + "'s" + " change to " + _stock_price);

    }

    public Stock get_stock() {
        return _stock;
    }
    public void set_stock(Stock value) {
        _stock = value;
    }
    public String getName(){
        return  _investorName;
    }

}
