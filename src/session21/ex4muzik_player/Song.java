package session21.ex4muzik_player;

public class Song {
    private String title,artist;
    private double duration;


    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        setDuration(duration);
    }

    public void play() throws InterruptedException {
        System.out.println(title+ " "+artist+" "+ " is playing.  "+duration);
        Thread.sleep((long)duration*1000);
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {

        this.title = title;
    }


    public String getArtist() {
        return artist;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }


    public double getDuration() {
        return duration;
    }


    public void setDuration(double duration) {
        if(duration<=0){
            System.out.println("Invalid duration");
            return;
        }
        this.duration = duration;
    }



    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }


}
