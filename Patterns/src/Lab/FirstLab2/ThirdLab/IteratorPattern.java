package Lab.FirstLab2.ThirdLab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPattern {
    Food newFood ;
    Book newBook ;

    static void printAggregate(AbstractIterator i) {
        System.out.println("Iterating over collection:");
        for(i.First();  !i.IsDone(); i.Next()) {
            System.out.println(i.CurrentItem().getName());
        }
        System.out.println();
    }
/*
    public static void showFoods(){
        Food foods = new Food();
        for(Iterator iter = foods.getFoods().iterator(); iter.hasNext();){
            Object infos =  iter.next();
            System.out.println("Info" + infos);
        }
    }
    public static void showBooks(){
        Book books = new Book();
        for(Iterator iter = books.getBooks().iterator(); iter.hasNext();){
            Object infos = iter.next();
            System.out.println("Info" + infos);
        }
    }

 */
    /*public void showFoods() {
        ArrayList allFoods = newFood.foods;
        for (int i = 0; i < allFoods.size(); i++) {
            Item items = newFood.get(i);
            System.out.println(items.getName());
            System.out.println(items.getPrice());
            System.out.println(items.getType());
        }

    }
    public void showBooks(){
        ArrayList allBooks = newBook.books;
        for(int i = 0 ; i < allBooks.size() ; i++){
            Item items = newBook.get(i);
            System.out.println(items.getName());
            System.out.println(items.getPrice());
            System.out.println(items.getType());
        }
    }

     */

    public static void main(String[] args) {
        // Create Aggregate.
        AbstractAggregate aggregate = new Collection();
        /*
        aggregate.add(new Item("Item 0"));
        aggregate.add(new Item("Item 1"));
        aggregate.add(new Item("Item 2"));
        aggregate.add(new Item("Item 3"));
        aggregate.add(new Item("Item 4"));
        aggregate.add(new Item("Item 5"));
        aggregate.add(new Item("Item 6"));
        aggregate.add(new Item("Item 7"));
        aggregate.add(new Item("Item 8"));
        aggregate.add(new Item("Item 9"));
        */


        // Create Iterator

        //AbstractIterator iterator = aggregate.CreateIterator();
        // Traverse the Aggregate.
        //printAggregate(iterator);




    }
}
