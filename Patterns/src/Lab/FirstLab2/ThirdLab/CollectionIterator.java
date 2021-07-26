package Lab.FirstLab2.ThirdLab;

public class CollectionIterator implements AbstractIterator{


    public void First() {_current = 0;}
    public void Next()  {_current++; }
    public Item CurrentItem() { return (IsDone()?null:_collection.get(_current)); }
    public Boolean IsDone() {	return _current >= _collection.getCount(); }

    public CollectionIterator(Collection collection) {
        _collection = collection;
        _current = 0;
    }

    private Collection _collection;
    private int _current;
}
