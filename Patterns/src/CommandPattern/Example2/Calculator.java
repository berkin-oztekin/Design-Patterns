package CommandPattern.Example2;

public class Calculator {
    private int current_value ;

    public Calculator() {
        current_value = 0;
    }


    public void Action(char operator , int operand ){
        switch (operator){
            case '+' : current_value += operand ;
                break;
            case '-' : current_value -= operand ;
                break;
            case '*' : current_value *= operand ;
                break;
            case '/' : current_value /= operand ;
                break;
        }
        System.out.println("Current Value is ---->  " + current_value + "(following " + operator +" " + operand + " )");
    }

}
