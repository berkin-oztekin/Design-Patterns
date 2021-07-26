package IteratorPattern;

public class nameRepostery implements Container {
    static String[] names = {"Berkin", "Güliz", "Serhat", "Ekincan"};


    @Override
    public Itarator getIterator() {
        return new namesItarator();
    }

}

