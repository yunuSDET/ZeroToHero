package session20.ex9song;

public class Song {

    public String name;
    public int duration;
    public String singer;



    public Song(String name, int duration, String singer) {
        this.name = name;
        this.duration = duration;
        this.singer = singer;
    }



    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", singer='" + singer + '\'' +
                '}';
    }


}

/*
***Creat a class named Song
Instance variables :name,duration,singer
A constructor:sets all fields
Actions:toString,

Create a class named PlayList
Instance variables:playListName,songs (arraylist of Song objects)
A constructor :sets playListName
Methods:addSong,removeSong,play,playAll,toString

Create a class named Player with a main method.
Create a PlayList object and add five songs in it. Remove a song which was added and create a menu like blow
1 Play a song
2 Play all songs
3 Add song
4 Remove song
5 Shuffle the list
6 Exit
And do what user wants
 */