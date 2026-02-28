package strategy;

public class UnarmedAttack implements AttackStrategy {

    @Override
    public void attack(Player player) {
        System.out.println(player.getNombre() + "salud antes del ataque del desarmado: " + player.getSalud());
        System.out.println("desarmado attacking");
        player.setSalud(player.getSalud() - 20);
        System.out.println(player.getNombre() + "salud después del ataque del desarmado: " + player.getSalud());
    }

}
