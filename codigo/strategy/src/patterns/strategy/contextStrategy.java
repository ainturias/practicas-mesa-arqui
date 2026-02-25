package patterns.strategy;

public class contextStrategy {

    //pro la relación de agregacion y la multiplicidad de 1.
    private Strategy strategy;

    //cargar la clase strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //ejecutar el algoritmo de la strategy
    public String ejecutarStrategy(int n) {
        //aquí si o si llamar al generarSerie.
        return this.strategy.generarSerie(n);
    }

}
