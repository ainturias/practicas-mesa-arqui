package strategyEx1;

public class Enemigo {

    // atributos
    private String nombre;          // nombre del enemigo
    private Strategy strategy;     // 

    // constructor
    public Enemigo() {
    }

    public Enemigo(String nombre, Strategy strategy) {
        this.nombre = nombre;
        this.strategy = strategy;
    }

    // metodo para atacar a un jugador
    public void atacar(Jugador jugador) {
        strategy.atacar(jugador);
    }

    // setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    // metodo para cambiar de estrategia
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
