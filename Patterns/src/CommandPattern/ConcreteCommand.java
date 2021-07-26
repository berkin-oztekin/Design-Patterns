package CommandPattern;
//Calculator Command
public class ConcreteCommand implements Command {
    private char _operator ;
    private int _operand ;
    private Receiver receiver ;

    public ConcreteCommand(Receiver receiver ,char _operator, int _operand ) {
        this._operator = _operator;
        this._operand = _operand;
        this.receiver = receiver;
    }

    @Override
    public void Excute() {
        receiver.Action(_operator , _operand);
    }

    @Override
    public void UnExcute() {
        receiver.Action(Undo(_operator) , _operand);
    }

    private char Undo(char _operator){
        switch(_operator){
            case '+' : return '-' ;
            case '-' : return '+' ;
            case '*' : return '/' ;
            case '/' : return '*' ;
            default: return ' ';
        }
    }
}
