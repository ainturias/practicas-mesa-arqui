package strategy;

public class SerieC implements Strategy {

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
        if (index == 1) {
            return 1;
        }
        return acumulador * 10;
    }
}
