package CommandPattern.Example2;

//MacroCommand

public class Area implements Command {
    Calculator calculator ;
    Command []_commands ;
    Multiplication multiplication ;
    int y ;

    public Area(Command[] _commands ) {

        this._commands = _commands;
        y = 1;

    }

    @Override
    public void Execute() {
        for(int i = 0; i < _commands.length ; i++){
            _commands[i].Execute(); //Execute the all other Concrete commands
        }

    }
}
