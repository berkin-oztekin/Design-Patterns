package AdapterPattern.Class;

public class NaToEuro extends EurSocket implements NaSocket{

    @Override
    public int NaSocket() {
       int voltage  = EuSocketVoltage();
       return voltage ;
    }
}
