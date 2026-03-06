package templatemethodEx1;

public class Mage extends EnemyTemplate {

    @Override
    public void setSkills() {
        System.out.println("Healt: 100, Mana: 100, Stamina: 50");
    }

    @Override
    public void attack() {
        System.out.println("Mage attack");
    }

    @Override
    public void protect() {
        System.out.println("Mage protect");
    }

    @Override
    public void result() {
        System.out.println("Mage has survived");
    }

}
