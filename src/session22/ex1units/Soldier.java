package session22.ex1units;

public class Soldier extends Unit{
        private int attackPower;

    public Soldier(int position, int health, int attackPower) {
        super(position, health);
        this.attackPower = attackPower;
    }

    @Override
    public void attack(Unit unit) {
        unit.setHealth(unit.getHealth()-attackPower);

        try {
            if(unit.getHealth()<=0)
                throw new AttackException("Health can not be less than 0");
        }catch (AttackException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Soldier is attacking.");
    }



}
