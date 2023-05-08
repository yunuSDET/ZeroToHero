package session20.ex6Player;

public class Player {
    public String name;
    public int hitPower;
    public int health;
    public boolean isAlive;

    public Player(String name, int hitPower) {
        this.name = name;
        this.hitPower = hitPower;
        this.health=100;
        this.isAlive=true;
    }





    public void hit(Player player){

        if(player.isAlive) {
            player.health-=this.hitPower;
            if(player.health<=0) {
                System.out.println(this.name+" hit. "+player.name+" is dead");
                player.isAlive=false;
                return;
            }
            System.out.println(this.name+" hit. "+player.name+" is injured. Health is "+player.health);
        }else{
            System.out.println(player.name+" is dead so you cannot hit!");
        }

    }


    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPower=" + hitPower +
                ", health=" + health +
                ", isAlive=" + isAlive +
                '}';
    }
}
