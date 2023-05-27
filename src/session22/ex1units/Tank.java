package session22.ex1units;

public class Tank extends Unit{
    private int defensePower;


    public Tank(int position, int health, int defensePower) {
        super(position, health);
        this.defensePower = defensePower;
    }


    @Override
    public void attack(Unit unit) {
        System.out.println("Tank is attacking.");
    }


    public void defend(Unit unit){
        unit.setHealth(unit.getHealth()-defensePower);

        try {
            if(unit.getHealth()<=0)
                throw new AttackException("Health can not be less than 0");
        }catch (AttackException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Tank is defensing.");
    }


}
