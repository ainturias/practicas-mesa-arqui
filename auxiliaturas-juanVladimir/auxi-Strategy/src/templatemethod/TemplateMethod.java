package templatemethod;

public abstract class TemplateMethod {

    // Metodo Plantilla
    public String generarSerie(int n) {
        String s = "";
        int acumulador = 0;

        for (int i = 1; i <= n; i++) {
            acumulador = next(acumulador, i);
            s = s + Integer.toString(acumulador) + " + ";
        }
        return s;
    }
    
    // operacion/metodo primitivo
     public abstract int next(int acumulador, int index);

}
