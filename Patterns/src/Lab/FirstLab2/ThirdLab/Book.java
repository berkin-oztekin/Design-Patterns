package Lab.FirstLab2.ThirdLab;

import java.util.ArrayList;

public class Book {
    ArrayList<Item> books ;

        public Book(){
            books = new ArrayList<Item>();
            addSong("Indiana-Jones" , "Action-Adcenture" , 45);
            addSong("Leak" , "Sci-Fi" , 89);
            addSong("Fly-Jack" , "Action" , 45);

        }

        public void addSong(String name , String type , int price){
            Item item = new Item(name , type , price);
            books.add(item);
        }


        public ArrayList<Item> getBooks(){
            return books;
        }

}
