package session20.ex9song;

import java.util.Collections;
import java.util.Scanner;

public class Player {

    public static void main(String[] args) throws InterruptedException {

        Playlist playlist=new Playlist("Arabesk");

        playlist.addSong("Unutamadım",4,"Müslüm");
        playlist.addSong("Bir Kadın Tanıdım",5,"Müslüm");
        playlist.addSong("Sevgiler Çiçek Gibi",5,"Ferdi");
        playlist.addSong("Bu Şehrin Geceleri",6,"Ferdi");
        playlist.addSong("Bir Ben Olaydım",3,"Ferdi");
        playlist.addSong("Küllenen Aşk",4,"Cengiz");

        playlist.removeSong("Bir Kadın Tanıdım");


        int choice=0;
        Scanner input=new Scanner(System.in);


        boolean quit=true;
while (quit){
    System.out.println(
            "1 Play a song\n" +
                    "2 Play all songs\n" +
                    "3 Add song\n" +
                    "4 Remove song\n" +
                    "5 Shuffle the list\n" +
                    "6 Exit");

    choice=input.nextInt();
    input.nextLine();

        switch (choice){
            case 1:
                playlist.listSongs();
                System.out.println("Enter a song name or number to play");
                String userInput=input.nextLine();
                if(userInput.matches("[0-9]+")){
                    playlist.play(Integer.parseInt(userInput)-1);
                }else{
                    playlist.play(userInput);
                }
                break;
            case 2:
                playlist.playAll();
                break;
            case 3:
                System.out.println("Enter song name");
                String songName=input.nextLine();
                System.out.println("Enter duration of song (int)");
                int durationOfSong=input.nextInt();
                input.nextLine();
                System.out.println("Enter the name of singer");
                String singerName=input.nextLine();
                playlist.addSong(songName,durationOfSong,singerName);
                playlist.listSongs();
                break;
            case 4:
                playlist.listSongs();
                System.out.println("Enter the name of the song to remove");
                String name=input.nextLine();
                playlist.removeSong(name);
                playlist.listSongs();
                break;
            case 5:
                Collections.shuffle(playlist.songs);
                playlist.listSongs();
                break;
            case 6:
                System.out.println("Player closed");
                quit=false;
                break;
            default:
                System.out.println("Invalid input");
        }



}




    }
}
