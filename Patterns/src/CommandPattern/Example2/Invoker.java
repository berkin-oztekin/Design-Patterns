package CommandPattern.Example2;

import java.util.ArrayList;

public class Invoker {
    private int current  ;

    public Invoker() {
        current = 0;
    }

    ArrayList <Command> _commands = new ArrayList<>();

    void compute ( Command command ){
        command.Execute();
        _commands.add(command);
        current++ ;
    }

    void compute2 (Command command){
        command.Execute();
    }
}
