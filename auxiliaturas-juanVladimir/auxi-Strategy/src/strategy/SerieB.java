package strategy;

public class SerieB implements Strategy {

    // F = 1 + 10 + 100 + 1000 + …….
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
