package CompositePattern.Example;

public class Song extends SongComponent{
    private String songName ;
    private int realseYear ;
    private String bandName  ;

    public Song(String songName, int realseYear, String bandName) {
        this.songName = songName;
        this.realseYear = realseYear;
        this.bandName = bandName;
    }

    public String getSongName() { return songName; }
    public String getBandName() { return bandName; }
    public int getReleaseYear() { return realseYear; }

    public void displaySongInfo(){
        System.out.println(getSongName() + " was recorded by " +
        getBandName() + " in " + getReleaseYear());

    }

}
