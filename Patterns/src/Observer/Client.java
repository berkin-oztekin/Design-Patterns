package Observer;

public class Client {
    public static  void main (String [] args){
        Investor investor1 = new Investor("Berkin");
        Investor investor2 = new Investor("Ekincan");

        IBM ibm = new IBM("Volvo" , 120.1);
        investor1.set_stock(ibm);
        investor2.set_stock(ibm);

        ibm.Attach(investor1);
        ibm.Attach(investor2);

        ibm.set_price(100.1);
        ibm.set_price(105.1);
        ibm.set_price(110.1);
        ibm.set_price(120.1);

        System.out.println("Remove Ekincan from the list ");
        ibm.Detach(investor2);

        ibm.set_price(100);
        ibm.set_price(105);
        ibm.set_price(110);
        ibm.set_price(120);

        ibm = null ;

        System.out.println(investor1.get_stock());

    }
}
