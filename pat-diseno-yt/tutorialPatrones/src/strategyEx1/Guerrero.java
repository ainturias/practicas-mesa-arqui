
package strategyEx1;

public class Guerrero implements Strategy {

    @Override
    public void atacar(Jugador jugador) {
        System.out.println("Salud del jugador " + jugador.getNombreJugador() + " antes que ->GUERRERO ataque: " + jugador.getSaludJugador());
        System.out.println("GUERRERO Atacando!!!");
        jugador.setSaludJugador(jugador.getSaludJugador() - 10);
        System.out.println("Salud del jugador " + jugador.getNombreJugador() + " después que ->GUERRERO ataque: " + jugador.getSaludJugador());
    }


}
