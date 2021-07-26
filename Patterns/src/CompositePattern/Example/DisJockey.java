package CompositePattern.Example;

public class DisJockey {
    SongComponent songList ;

    public DisJockey(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList() {
       songList.displaySongInfo();
    }
}
