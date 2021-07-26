package CommandPattern;
//Client
public class Client {
    public static void main (String [] args){
        Command command = null ;
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        command = new ConcreteCommand(receiver , '+' , 10);
        invoker.compute(command);

        command = new ConcreteCommand(receiver , '-' , 5);
        invoker.compute(command);

        command = new ConcreteCommand(receiver , '*' , 100);
        invoker.compute(command);

        command = new ConcreteCommand(receiver , '/' , 2);
        invoker.compute(command);


        System.out.println();

        invoker.Undo(4);


    }
}
