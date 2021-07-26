package Lab.FirstLab2.ThirdLab;

import java.util.ArrayList;
import java.util.Iterator;

public class Food {
        ArrayList<Item> foods ;

        public Food(){
                addFood("Meal" ,"Red", 67);
                addFood("Egg" ,"White", 15);
                addFood("Oil" ,"Olive", 120);
        }


        public void addFood(String name , String type , int price){
                Item item = new Item(name , type , price);
                foods.add(item);
        }

        public ArrayList<Item> getFoods() {
                return foods;
        }

        public void foodIterator(){

        }
}
