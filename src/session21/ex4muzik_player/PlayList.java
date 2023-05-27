package session21.ex4muzik_player;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<Song> songs;

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public PlayList() {
        this.songs = new ArrayList<>();
    }

    public void addSong(String title,String artist,double duration){
        songs.add(new Song(title,artist,duration));
    }



    public void removeSong(String title){
        songs.removeIf(i->i.getTitle().equalsIgnoreCase(title));
    }


    public void playAll() throws InterruptedException {
        for (Song each : songs) {
            each.play();
        }
    }



}
