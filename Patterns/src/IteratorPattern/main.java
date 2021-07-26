package IteratorPattern;

public class main {
    public static void main(String[] args) {
        nameRepostery namerepostery = new nameRepostery();

        for (Itarator iter = namerepostery.getIterator(); iter.hasnext(); ) {
            String name = (String) iter.next();
            System.out.println("Name :" + name);
        }
    }
}
