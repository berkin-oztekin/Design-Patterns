package IteratorPattern.Example;


import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
    SongInfo[] bestSongs;
    int arrayValue = 0;


    public SongsOfThe80s() {
        bestSongs = new SongInfo[3];
        addSong("Take On me", "a-ha", 1985);
        addSong("I wanna Dance With someone", "Whitney Houston", 1987);
        addSong("Dont Stop Believin", "Journey", 1981);

    }

    private void addSong(String songName, String bandName, int songRealseDate) {
        SongInfo songInfo = new SongInfo(songName, bandName, songRealseDate);
        bestSongs[arrayValue] = songInfo;
        arrayValue++;
    }
/*
        public SongInfo[] getBestSongs(){
          return bestSongs ;

        }

 */

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}

