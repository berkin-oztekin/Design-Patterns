package SingletonAndFacade;

import java.util.Scanner;

public class Client {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        InputReceiver inputReceiver = new InputReceiver(scanner);

        System.out.println(inputReceiver.getIntegers());



    }
}
