package Observer;

public class IBM extends Stock{

    public IBM(String _symbol, double _price) {
        super(_symbol, _price);
    }

    public double get_price() {
        return _price;
    }
    @Override
    public void set_price(double value) {
        _price = value ;
        Notify();
    }

}
