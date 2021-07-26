package CommandPattern.Example2;

public class Client {
    public static  void main (String[] args){
        Command command = null ;
        Invoker invoker = new Invoker();
        Calculator calculator = new Calculator();



        command = new Sum(calculator , 1  );
        invoker.compute(command);

        command = new Multiplication(calculator , 10 );
        invoker.compute(command);

        command = new Divide(calculator , 3);
        invoker.compute(command);

        command = new Subtraction(calculator , 2 );
        invoker.compute(command);

        System.out.println();

        Divide divide = new Divide(calculator, 3 );
        Multiplication multiplication = new Multiplication(calculator, 4 );
        Sum sum = new Sum(calculator, 4 );
        Subtraction subtraction = new Subtraction(calculator , 25 );

       Command []area_Array = {multiplication , multiplication ,divide , sum , subtraction};
       Command y = new Area(area_Array);
       invoker.compute2(y);
    }
}
