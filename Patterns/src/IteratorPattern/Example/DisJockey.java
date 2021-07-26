package IteratorPattern.Example;

import java.util.Iterator;


public class DisJockey {
    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

/*
    public DisJockey(SongsOfThe70s newSongs70s, SongsOfThe80s newSongs80s, SongsOfThe90s newSongs90s) {
        songs70s = newSongs70s;
        songs80s = newSongs80s;
        songs90s = newSongs90s;
    }

 */

    public DisJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {

        iter70sSongs = newSongs70s;
        iter80sSongs = newSongs80s;
        iter90sSongs = newSongs90s;
    }
/*
    public void showTheSongs(){
        ArrayList al70sSongs = songs70s.getBestSongs(); // songs70s behave like class veriable then we make the operations on with it
        System.out.println("These are 70's best Songs");
        for(int i = 0  ; i < al70sSongs.size() ; i++ ){
            SongInfo bestSongs = (SongInfo) al70sSongs.get(i);
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getSongRealseDate());
        }
        SongInfo [] al80sSongs =  songs80s.getBestSongs();
        System.out.println("These are 80's best songs ");

        for(int i = 0  ; i< al80sSongs.length ; i++ ){
            SongInfo bestSongs = al80sSongs[i];
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getSongRealseDate());
        }
        Hashtable<Integer,SongInfo> ht90sSongs =  songs90s.getBestSongs();
        System.out.println("These are 80's best songs ");

        for(Enumeration<Integer> e = ht90sSongs.keys() ;e.hasMoreElements();){
            SongInfo bestSongs = ht90sSongs.get(e.nextElement());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getSongRealseDate());
        }

    }
     */

    public void showTheSongs2() {
        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70's");
        pirntTheSongs(songs70s);
        System.out.println("Songs of the 80's");
        System.out.println();
        pirntTheSongs(songs80s);
        System.out.println("Songs of the 90's");
        System.out.println();
        pirntTheSongs(songs90s);

    }

    private void pirntTheSongs(Iterator iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getSongRealseDate());

        }
    }

}
