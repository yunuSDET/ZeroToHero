package session20.ex9song;

import java.util.ArrayList;

public class Playlist {
    public String playlistName;
    public ArrayList<Song> songs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songs = new ArrayList<>();
    }

    public void addSong(String name, int duration,String singer){
        songs.add(new Song(name,duration,singer));
    }

    public void removeSong(String name){
        songs.removeIf(i->i.name.equals(name));
    }

    public void play(String name) throws InterruptedException {
        for (Song eachSong : songs) {
            if(eachSong.name.equals(name)) {
                System.out.println(eachSong.name+" "+eachSong.singer+" "+eachSong.duration+" minutes is playing");
                Thread.sleep(3000);
                break;
            }
        }
    }

    public void play(int index) throws InterruptedException {
        System.out.println(songs.get(index).name+" "+songs.get(index).singer+" "+songs.get(index).duration+" minutes is playing");
        Thread.sleep(3000);
    }

    public void playAll() throws InterruptedException {
        for (Song eachSong : songs) {
            System.out.println(eachSong.name+" "+eachSong.singer+" "+eachSong.duration+" minutes is playing");
            Thread.sleep(3000);
        }
    }

    public void listSongs(){
        System.out.println("-".repeat(30));
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(i+1+" "+songs.get(i).name);
        }
        System.out.println("-".repeat(30));
    }

    public String toString() {
        return "Playlist{" +
                "playlistName='" + playlistName + '\'' +
                ", songs=" + songs +
                '}';
    }
}
