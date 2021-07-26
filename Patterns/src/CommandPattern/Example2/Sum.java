package CommandPattern.Example2;
//ConcreteCommand
public class Sum implements Command {
    Calculator calculator ;
    private char _operator = '+' ;
    private int _operand ;

    public Sum(Calculator calculator,  int _operand ) {
        this.calculator = calculator;
        this._operand = _operand;

    }

    @Override
    public void Execute() {
        calculator.Action('+' , _operand);
    }

}
