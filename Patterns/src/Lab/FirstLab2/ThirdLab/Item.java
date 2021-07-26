package Lab.FirstLab2.ThirdLab;

public class Item {
    private String _name;
    private String type ;
    private int price ;

    public Item(String _name, String type, int price) {
        this._name = _name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return _name;};

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
