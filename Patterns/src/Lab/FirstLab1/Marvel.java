package Lab.FirstLab1;

public class Marvel {
    public static void main(String []args){

        WorkPlace w = WorkPlace.getUniqueInstance();
        WorkPlace a = WorkPlace.getUniqueInstance();


        w.setName("Stark Industries");

        w.createProduct1();
        w.createProduct2();

        w.printDetails();
        a.printDetails();

    }
}
