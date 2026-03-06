package strategy;

public class SerieA implements Strategy {

    // F = 1 + 3 + 6 + 10 + 15 + …….
    @Override
    public String generarSerie(int n) {
        String s = "";
        int acumulador = 0;

        for (int i = 1; i <= n; i++) {
            acumulador = next(acumulador, i);
            s = s + Integer.toString(acumulador) + " + ";
        }
        return s;
    }

    public int next(int acumulador, int index) {
        return acumulador + index;
    }

}
