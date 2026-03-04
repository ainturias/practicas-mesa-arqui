package patterns;

public class SerieC implements Strategy {

    @Override
    public String generarSerie(int n) {
        String s = "";
        int termino = 5;

        for (int i = 1; i <= n; i++) {
            s = s + Integer.toString(termino) + " , ";
            termino = termino * 10;
        }
        return s;
    }
}
