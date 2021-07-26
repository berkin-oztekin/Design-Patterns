package CompositePattern;
import java.util.ArrayList;

public class CompositeElement extends DrawingElement{
    private String name ;
    PrimElem2 primElem2;

    private ArrayList<DrawingElement> elements = new ArrayList<DrawingElement>();



    public CompositeElement(String name) {
        this.name = name;

    }

    public void Add(DrawingElement d) {
        if(d == primElem2)
            System.out.println("We cant this primitive element");
        else
            elements.add(d);
    }

    public void Remove(DrawingElement d) {
        for(int i = 0 ; i <elements.size() ; i++) {
            if(elements.get(i).getName().equals(d.getName())){
                elements.remove(i);
                return ;
            }
        }
    }

    public void Display(int indent) {
        for(int i = 1 ; i < elements.size() ; i++ ){
            System.out.print("-");
            System.out.println("+" + getChild(i));
        }
        for(int i = 0 ; i < elements.size() ; i++){
            elements.get(i).Display(indent+2);
        }
    }

    public String getName() {
        return name;
    }
    public int getChild(int i ){
        return i ;
    }
}
