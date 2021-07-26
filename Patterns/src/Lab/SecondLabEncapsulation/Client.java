package Lab.SecondLabEncapsulation;

import java.nio.channels.Pipe;

public class Client {

    public static void main(String []args){
        Distance newDistance = new Distance();

        //Point 1
        int x_1 = 5;
        int y_1 = 6;

        //Point 2
        int x_2 = 8;
        int y_2 = 11;

       // int z_1 = 4 ;
        //int z_2 = 8 ;

        System.out.println("The distance between two points is: " + newDistance.getDistance());
        System.out.println("The 3d distance is : " + newDistance.getDistance3D());
        System.out.println("The 4d distance is : " + newDistance.getDistance4D());

        //System.out.println("The 3d distance is :" + newDistnace.distance3D(x_1, y_1, x_2, y_2 , z_1 , z_2));
    }
}
