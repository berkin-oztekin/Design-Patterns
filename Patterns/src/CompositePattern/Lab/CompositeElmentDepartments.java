package CompositePattern.Lab;

import java.util.ArrayList;

public class CompositeElmentDepartments implements IEU{
    private String departmantName ;
    ArrayList<IEU> elements = new ArrayList<IEU>();

    public CompositeElmentDepartments(String departmantName) {
        this.departmantName = departmantName;
    }

    @Override
    public void Add(IEU element) {
        elements.add(element);
    }

    @Override
    public void Remove(IEU element) {
        for(int i = 0 ; i < elements.size() ; i++){
            if(elements.get(i).getName().equals(element.getName()))
                elements.remove(i);
            return;
        }
    }

    @Override
    public void Display(int indent) {
        for(int i = 1 ; i < elements.size() ; i++ ){
            System.out.print("-");
            System.out.println("+" + getName());
        }
        for(int i = 0 ; i < elements.size() ; i++){
            elements.get(i).Display(indent+2);
        }
    }

    @Override
    public String getName() {
        return departmantName;
    }
}
