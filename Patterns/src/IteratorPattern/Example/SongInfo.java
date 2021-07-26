package IteratorPattern.Example;

public class SongInfo {
    String songName;
    String bandName;
    int songRealseDate;

    public SongInfo(String newSongName, String newBandName, int newSongRealseDate) {
        songName = newSongName;
        bandName = newBandName;
        songRealseDate = newSongRealseDate;
    }


    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getSongRealseDate() {
        return songRealseDate;
    }
}
