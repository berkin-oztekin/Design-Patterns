package CompositePattern.Example;

public class Client {
    public static void main (String [] args){

    SongComponent metalMusic = new SongGroup("Metal" , "Owwww yeahhh");
    metalMusic.add(new Song("Knock-Knock" ,1986  ,"Guns And Roses"));
    metalMusic.add(new Song("Sick And Destroy" ,1986  ,"Metallica"));

    SongComponent alternativeRock = new SongGroup("Alternative Rock" , "ssssshsss");
    alternativeRock.add(new Song("Kendimi Kandırmam" , 2017, "Seksendört"));
    alternativeRock.add(new Song("Yine Yazı Bekleriz" , 2017, "TNT"));
    alternativeRock.displaySongInfo();

    System.out.println();

    DisJockey disJockey = new DisJockey(alternativeRock);
    disJockey.getSongList();
    }

}


