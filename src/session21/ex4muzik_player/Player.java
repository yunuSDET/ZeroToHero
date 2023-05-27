package session21.ex4muzik_player;

public class Player {

    public static void main(String[] args) throws InterruptedException {

        PlayList playList=new PlayList();

        playList.addSong("Song1","Artist1",3.54);
        playList.addSong("Song2","Artist2",4.25);
        playList.addSong("Song3","Artist3",6.16);
        playList.addSong("Song4","Artist4",2.16);
        playList.addSong("Song5","Artist5",4.52);

        playList.removeSong("Song5");

        playList.getSongs().forEach(System.out::println);

        playList.playAll();

    }
}
