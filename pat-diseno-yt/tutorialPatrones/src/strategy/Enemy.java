package strategy;

public class Enemy {

    private String name;
    private AttackStrategy attackStrategy;

    public Enemy(String name) {
        this.name = name;
        this.attackStrategy = new UnarmedAttack();
    }

    public void attack(Player player) {
        attackStrategy.attack(player);
    }

    /*
    - si tenemos 3 tipos no es necesario aplicar el strategy.
    - si tenemos una clase elevada de enemigos y puede que aumente, ahí si es necesario aplicar strategy.
    - normalmente son métodos que tienen muchas líneas y va ir creciendo.
     */
//    public void attack(String type) {
//        if (type.equalsIgnoreCase("warrior")) {
//            System.out.println("warrior attack");
//        }
//        else if (type.equalsIgnoreCase("mage")) {
//            System.out.println("mage attack");
//        }
//        else
//                System.out.println("unarmed attack");
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
