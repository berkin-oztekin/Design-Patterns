package Lab.FirstLab2.ThirdLab;

public interface AbstractAggregate {
    public AbstractIterator CreateIterator();
    public void add(Item it); 		// Not needed for iteration.
    public int getCount(); // Needed for iteration.
    public Item get(int idx); // Needed for iteration.
}
