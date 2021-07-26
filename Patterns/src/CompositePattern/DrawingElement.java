package CompositePattern;
public abstract class DrawingElement {
    public void Add(DrawingElement d){
        throw new UnsupportedOperationException();
    }
    public void Display(int ident){
        throw new UnsupportedOperationException();
    }
    public String getName(){
        throw new UnsupportedOperationException();
    }
    public void Remove(DrawingElement d){
        throw new UnsupportedOperationException();
    }
    public int getChild (int i){
        throw new UnsupportedOperationException();
    }

}
