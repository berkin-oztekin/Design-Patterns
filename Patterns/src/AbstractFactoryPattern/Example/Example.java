package AbstractFactoryPattern.Example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

abstract class Parts{
    abstract double getprice();
    abstract String displayName();
}
class CPU extends Parts{
    protected double price ;
    protected String name ;
    @Override
    double getprice() {
        return price;
    }
    @Override
    String displayName() {
        return name ;
    }
}
class NvdiaCPU extends CPU{
    public NvdiaCPU(double p) {
        price = p ;
        name = new String("Nvdia CPU ");
        System.out.println("Nvdia CPU is created ");
    }
}
class AmdCPU extends CPU{
    public AmdCPU(double p) {
        price = p ;
        name = new String("AMD CPU ");
        System.out.println("AMD CPU is created ");
    }
}
class GPU extends Parts{
    protected double price ;
    protected String name ;
    @Override
    double getprice() {
        return price;
    }
    @Override
    String displayName() {
        return name;
    }
}
class NvdiaGPU extends GPU{
    public NvdiaGPU(double p ) {
        price = p;
        name = new String("Nvdia GPU");
        System.out.println("Nvdia GPU is created ");
    }
}
class AmdGPU extends GPU{
    public AmdGPU(double p ) {
        price = p;
        name = new String("AMD GPU");
        System.out.println("AMD GPU is created ");
    }
}
abstract class PCFactory {
    abstract public CPU createCPU();
    abstract public GPU createGPU();
}
class NvdiaFactory extends PCFactory{
    @Override
    public CPU createCPU() {
        return new NvdiaCPU(1300.0); }
    @Override
    public GPU createGPU() {
        return new NvdiaGPU(1500.0);
    }

}
class AmdFactory extends PCFactory{
    @Override
    public CPU createCPU() {
        return new AmdCPU(1230); }
    @Override
    public GPU createGPU() {
        return new AmdGPU(1335.0);
    }
}

class BuildPC{
    private ArrayList <Parts> parts;
    public void createPc(PCFactory factory){
            parts = new ArrayList<>();
            parts.add(factory.createCPU());
            parts.add(factory.createGPU());
    }
    void displayParts() {
        System.out.println("\tListing Parts\n\t-------------");
        parts.forEach(p  -> System.out.println("\t"+ p.displayName() +
                " " + p.getprice()));
    }
}

    class Example{
        public static void main (String [] args){
            PCFactory NvdiaFactory = new NvdiaFactory();
            PCFactory AmdFactory = new AmdFactory();

            BuildPC PC = new BuildPC();
            System.out.println("Creating NVDIDA");
            PC.createPc(NvdiaFactory);
            PC.displayParts();

            System.out.println("Creating AMD");
            PC.createPc(AmdFactory);
            PC.displayParts();

        }

}
