package AdapterPattern.Class;

public class Client {
    public static void main(String [] args ) {

        NaSocket naSocket = new NaToEuro();

        int voltage = naSocket.NaSocket();
        VCR vcr = new VCR();
        vcr.powerUp(voltage);

        }
    }
