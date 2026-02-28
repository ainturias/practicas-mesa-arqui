package strategy;

public class MageAttack implements AttackStrategy {

    @Override
    public void attack(Player player) {
        System.out.println(player.getNombre() + "salud antes del ataque del mago: " + player.getSalud());
        System.out.println("mago attacking");
        player.setSalud(player.getSalud() - 20);
        System.out.println(player.getNombre() + "salud después del ataque del mago: " + player.getSalud());
    }

}
