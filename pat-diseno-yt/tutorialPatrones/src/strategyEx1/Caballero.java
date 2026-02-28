
package strategyEx1;

public class Caballero implements Strategy {

    @Override
    public void atacar(Jugador jugador) {
        System.out.println("Salud del jugador " + jugador.getNombreJugador() + " antes que ->CABALLERO ataque: " + jugador.getSaludJugador());
        System.out.println("CABALLERO Atacando!!!");
        jugador.setSaludJugador(jugador.getSaludJugador() - 30);
        System.out.println("Salud del jugador " + jugador.getNombreJugador() + " después que ->CABALLERO ataque: " + jugador.getSaludJugador());
    }
    
    
}
