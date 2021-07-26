package SingletonAndFacade;

import java.util.ArrayList;

public class Mean {
    InputReceiver inputReceiver ;
    ArrayList<Integer> numbers = new ArrayList<>();

    public Mean(InputReceiver inputReceiver) {
        this.inputReceiver = inputReceiver;

    }

    public int compute(){
        int sum = 0;
        int counter  = 0;

        while (true) {
            System.out.println("If you want to calcualte the given numbers press 0 ");
            String command = inputReceiver.scanner.nextLine();
            int x = inputReceiver.scanner.nextInt();
            if (x == 0) {
                System.out.println("Thx for using that ");
                break;
            } else {
                numbers.add(x);
                counter ++ ;
                sum = sum + x;
                sum = sum / counter;
            }
        }
        return sum ;
    }
}
