package Lab.FirstLab1;

public class WorkPlace {
    private String name;
    private String address ;
    private String owner ;
    private static WorkPlace uniqueInstance = null ;

    public WorkPlace(){
        name = "def";
        address = "Malibu";
        owner  ="Mr.Stark";
    }


    public void setName(String n){name = n;}

    public void createProduct1(){
        System.out.println("Product 1 Created...");}
    public void createProduct2(){
        System.out.println("Product 2 Created...");}

    public void printDetails(){
        System.out.println(name + ", " + address + ", " + owner);
    }

    public static WorkPlace getUniqueInstance() {
            if( uniqueInstance == null)
                uniqueInstance = new WorkPlace();
        return uniqueInstance;
    }
}
