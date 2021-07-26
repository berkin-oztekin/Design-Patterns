package CommandPattern;
//User
import java.util.ArrayList;

public class Invoker {
    private int current ;
    private ArrayList<Command> _commands = new ArrayList<Command>();


    public Invoker(){
        current = 0 ;
    }

    void Redo(int levels) {
        for(int i = levels ; i > 0 ; i--){
            if(current > 0 ){
                Command command = _commands.get(--current);
                command.Excute();
            }
        }
    }

    void Undo (int levels ){
        for(int i = 0  ; i < levels ; i++){
            if(current > 0 ){
                Command command = _commands.get(--current);
                command.UnExcute();
            }
        }

    }
    void compute (Command command){
        command.Excute();
        _commands.add(command);
        current++;
    }

}
