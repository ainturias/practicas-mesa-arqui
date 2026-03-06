
package templateystrategy;

public class ContextStrategy {
    
    private TemplateMethod strategy;

    public void setStrategy(TemplateMethod strategy) {
        this.strategy = strategy;
    }

    public String generarSerie(int n){
        return this.strategy.generarSerie(n);
    }
    


    



    
    
}
