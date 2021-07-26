package CompositePattern;


public class Client {
    public static void main(String [] args){
        CompositeElement root = new CompositeElement("Picture");
        root.Add(new PrimitiveElement("Red Line"));
        root.Add(new PrimitiveElement("Blue Circle"));
        root.Add(new PrimitiveElement("Green Box"));


        CompositeElement comp = new CompositeElement("Two Circles");
        comp.Add(new PrimitiveElement("Blue Circle"));
        comp.Add(new PrimitiveElement("Red Circle"));
        root.Add(comp);

       /* PrimElem2 pe2 = new PrimElem2("BrownLine");
        pe2.Add(new PrimitiveElement("DASDAF"));  // Safety

        */

        root.Display(1);
    }

}
