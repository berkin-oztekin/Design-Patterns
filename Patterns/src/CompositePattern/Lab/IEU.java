package CompositePattern.Lab;

public interface IEU {
    public void Add(IEU element);
    public void Remove(IEU element);
    public void Display(int indent);
    public String getName();

}
