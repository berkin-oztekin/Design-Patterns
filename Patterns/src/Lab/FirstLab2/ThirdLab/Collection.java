package Lab.FirstLab2.ThirdLab;

import java.util.ArrayList;

public class Collection implements AbstractAggregate {
    private ArrayList<Item> _items = new ArrayList<Item>();

    public	CollectionIterator CreateIterator() {
        return new CollectionIterator(this);
    }
    public int getCount () {return _items.size(); }
    public void add(Item item) {_items.add(item);};
    public Item get(int index) { return _items.get(index);};
}
