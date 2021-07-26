package CommandPattern.Example;

public class Stock {
    private String name = "ABC" ;
    private int quantity = 10 ;


    void Buy(){
        System.out.println("Stock [ Name: "+name+ "]" + " Quantity[" + ++quantity + "] bought ");

    }

    void Sell(){
        System.out.println("Stock [ Name: "+name+ "]" + " Quantity[" + --quantity + "] selled ");
    }


}
