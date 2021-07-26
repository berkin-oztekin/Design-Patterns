package Lab.FirstLab2;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String [] args){
      Memory memory = new Memory("KH 500" , "AMD");
      MotherBoard motherboard = new MotherBoard("KK 900" , "Nvdia");
      HardDisk harddisk = new HardDisk("PP 333" , "Everest");
        Part part = new Part();
        List <Part> allparts = new ArrayList<>();
        allparts.add(memory);
        allparts.add(motherboard);
        allparts.add(harddisk);

        part.calculateTotal(allparts);


    }


}



