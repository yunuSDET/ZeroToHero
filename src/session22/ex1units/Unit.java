package session22.ex1units;

public abstract class Unit {
    private int position;
    private int health;

    public Unit(int position, int health) {
        setPosition(position);
        setHealth(health);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<=0) {
            throw new RuntimeException("Health must be larger than 0");
        }
        this.health = health;
    }

    abstract void attack(Unit unit);

    public void move(int newPosition){
        setPosition(newPosition);
    }


}
