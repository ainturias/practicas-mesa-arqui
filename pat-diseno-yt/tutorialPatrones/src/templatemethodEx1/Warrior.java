
package templatemethodEx1;

public class Warrior extends EnemyTemplate{

    @Override
    public void setSkills() {
        System.out.println("Healt: 150, Mana: 0, Stamina: 150");
    }

    @Override
    public void attack() {
        System.out.println("warrior attack");
    }

    @Override
    public void protect() {
        System.out.println("warrior protect");
    }

    @Override
    public void result() {
        System.out.println("warrior has survived");
    }
    
}
