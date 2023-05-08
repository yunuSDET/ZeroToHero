package session20.ex6Player;

public class Game {

    public static void main(String[] args) {


        Player firstPlayer=new Player("Yunus",38);
        Player secondPlayer=new Player("Burak",9);

        firstPlayer.hit(secondPlayer);
        firstPlayer.hit(secondPlayer);
        firstPlayer.hit(secondPlayer);


        secondPlayer.hit(firstPlayer);
        secondPlayer.hit(firstPlayer);
        secondPlayer.hit(firstPlayer);
        secondPlayer.hit(firstPlayer);
        secondPlayer.hit(firstPlayer);
        secondPlayer.hit(firstPlayer);


        System.out.println(firstPlayer);
        System.out.println(secondPlayer);


    }
}
