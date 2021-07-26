package Observer;

import java.util.ArrayList;

abstract class Stock {
    protected String _symbol;
    protected double _price;


    public Stock(String _symbol, double _price) {
        this._symbol = _symbol;
        this._price = _price;
    }

    public void Attach(Investor investor){
            investors.add(investor);

    }
    public void Detach(Investor investor){
        for(int i = 0 ; i <investors.size() ; i++){
            if(investors.get(i).getName() == investor.getName()){
                investors.remove(i);
                return;
            }
        }
    }
    public void Notify(){
        for(int i = 0 ; i < investors.size() ; i++){
            investors.get(i).Update(this);
        }
    }

    public String get_symbol() {
        return _symbol;
    }
    public void set_symbol(String value) {
        this._symbol = value;
    }
    abstract public void set_price(double value);
    public double get_price() {
        return 0;
    }

    protected ArrayList <Investor> investors = new ArrayList<Investor>();

}
