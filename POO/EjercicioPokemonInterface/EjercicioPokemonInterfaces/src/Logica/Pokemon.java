package Logica;

// clase abstracta
public abstract class Pokemon {

    // atributos
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
//    protected String tipo;

    // metodos abstractos
    protected abstract void atacarPlacaje();

    protected abstract void atacarAraniazo();

    protected abstract void atacarMordisco();

}
