package strategyEx1;

public class Mago implements Strategy {

    @Override
    public void atacar(Jugador jugador) {
        System.out.println("Salud del jugador " + jugador.getNombreJugador() + " antes que ->MAGO ataque: " + jugador.getSaludJugador());
        System.out.println("MAGO Atacando!!!");
        jugador.setSaludJugador(jugador.getSaludJugador() - 20);
        System.out.println("Salud del jugador " + jugador.getNombreJugador() + " después que ->MAGO ataque: " + jugador.getSaludJugador());
    }

}
