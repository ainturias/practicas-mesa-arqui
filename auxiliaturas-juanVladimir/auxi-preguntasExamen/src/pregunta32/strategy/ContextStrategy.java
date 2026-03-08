
package pregunta32.strategy;

public class ContextStrategy {
    
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public String obtenerFecha() {
        return strategy.obtenerFecha();
    }
    
    
    
}
