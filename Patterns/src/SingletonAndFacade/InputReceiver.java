package SingletonAndFacade;

import java.util.ArrayList;
import java.util.Scanner;

public class InputReceiver {
    Scanner scanner ;
    int x ;
    ArrayList<Integer> numbers = new ArrayList<>();

    public InputReceiver(Scanner scanner) {
        this.scanner = scanner;
    }
    public ArrayList<Integer> getIntegers(){
        int counter = 0 ;
        while(counter < 10) {
            System.out.println("Give numbers");
            x = scanner.nextInt();
            numbers.add(x);
            counter++ ;
        }
        return numbers ;
    }
}
