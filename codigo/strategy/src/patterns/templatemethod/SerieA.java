
package patterns.templatemethod;

public class SerieA {
    public String generarSerie (int n) {
        String s = "";
        int acumulador = 0;
        
        for (int index = 1; index < n; index++) {
            acumulador = siguienteSerie(index);
            s = s + Integer.toString(acumulador) + " , ";
        }
        return s;
    }

    private int siguienteSerie(int index) {
        return index * 10; 
    }
}
