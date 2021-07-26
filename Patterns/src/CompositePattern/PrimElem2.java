package CompositePattern;

public class PrimElem2 extends DrawingElement{
    private String name ;

    public PrimElem2(String name) {
        this.name = name;
    }

    public void Display(int ident) {
        for(int i = 0 ; i <= ident ; i++){
            System.out.print("-");
            System.out.println(" " + name);
        }
    }


    public String getName() {
        return name;
    }

}
