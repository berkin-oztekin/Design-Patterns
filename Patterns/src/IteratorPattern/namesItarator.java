package IteratorPattern;

public class namesItarator implements Itarator {
    int index;

    @Override
    public boolean hasnext() {
        return index < nameRepostery.names.length;
    }

    @Override
    public Object next() {
        if (this.hasnext()) {
            return nameRepostery.names[index++];
        }
        return null;
    }
}
