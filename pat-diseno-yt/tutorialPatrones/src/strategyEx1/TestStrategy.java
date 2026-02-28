package strategyEx1;

public class TestStrategy {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Alexander");

        Enemigo enemigo1 = new Enemigo("Enemigo 1", new Guerrero());

        enemigo1.atacar(jugador1);

        System.out.println("==============================");

        enemigo1.setStrategy(new Caballero());

        enemigo1.atacar(jugador1);

        System.out.println("==============================");

        Jugador jugador2 = new Jugador("Ricardo");

        enemigo1.atacar(jugador2);

        System.out.println("==============================");

        enemigo1.setStrategy(new Mago());
        
        enemigo1.atacar(jugador2);
        
        System.out.println("==============================");

    }
}
