package IteratorPattern.Example;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        bestSongs = new ArrayList<SongInfo>();
        addSong("DancingQueen", "Arrival", 1972);
        addSong("MySharona", "Formula45", 1973);
        addSong("December, 1963", " Who loves you", 1975);

    }

    private void addSong(String songName, String bandName, int songRealseDate) {
        SongInfo songInfo = new SongInfo(songName, bandName, songRealseDate);
        bestSongs.add(songInfo);
    }
    /*
    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs ;
    }

     */

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
