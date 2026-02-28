
package strategy;

public class WarriorAttack implements AttackStrategy {

    @Override
    public void attack(Player player) {
        System.out.println(player.getNombre() + "salud antes del ataque del warrior: " + player.getSalud());
        System.out.println("warrior attacking");
        player.setSalud(player.getSalud() - 20);
        System.out.println(player.getNombre() +  "salud después del ataque del warrior: " + player.getSalud());
    }
    
    
}
