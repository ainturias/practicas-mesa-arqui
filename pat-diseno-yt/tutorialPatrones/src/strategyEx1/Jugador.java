package strategyEx1;

public class Jugador {

    // atributos
    private String nombreJugador;
    private int saludJugador;

    //constructores
    public Jugador() {
    }

    public Jugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
        this.saludJugador = 100;
    }

    // setters y getters

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getSaludJugador() {
        return saludJugador;
    }

    public void setSaludJugador(int saludJugador) {
        this.saludJugador = saludJugador;
    }
    
    
}
