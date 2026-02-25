package patterns.strategy;


public class SerieA implements Strategy {

    @Override
    public String generarSerie(int n) {
        String s = "";
        int base = 0;

        for (int i = 1; i <= n; i++) {
            base = base + i;
            s = s + base + " , ";
        }
        return s;
    }

}



/*
PASOS:
1. Implementar la estrategia -> implements + Strategy.
2. sobreescribir los metodos abstractos.
    eso se hace dandole en el foquito
*/
