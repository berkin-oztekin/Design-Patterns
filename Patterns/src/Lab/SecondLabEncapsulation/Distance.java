package Lab.SecondLabEncapsulation;

public class Distance{
    private Point point ;
    public double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    }

    public double distance3D(int x1, int y1, int x2, int y2 , int z1 , int z2){
        return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))+((z2-z1)*(z2-z1)));
    }

    public double getDistance(){
        return  distance(5,6,8,11);
    }

    public double distance3DAgain(int z1 , int z2){
        return  Math.sqrt(getDistance()+((z1-z2)*(z1-z2)));
    }
    public double getDistance3D(){
        return  distance3DAgain( 2, 3);
    }
    public double Distance4D(int t1 , int t2){
        return  Math.sqrt(getDistance3D()+((t1-t2)*(t1-t2)));
    }
    public double getDistance4D(){
        return Distance4D(5 , 6);
    }


}
