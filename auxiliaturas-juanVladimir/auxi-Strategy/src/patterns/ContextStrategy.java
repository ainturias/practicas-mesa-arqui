package patterns;

public class ContextStrategy {

    private Strategy strategy;

    // metodo para cargar la clase strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // metodo para ejecutar el algoritmo de la strategy
    public String ejecutarStrategy(int n) {
        if (n > 0) {
            return this.strategy.generarSerie(n);   //llamar si o si el algoritmo de la estrategia

        }
        return "nada";
    }

}
