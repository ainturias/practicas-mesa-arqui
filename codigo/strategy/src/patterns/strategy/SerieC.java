package patterns.strategy;

public class SerieC implements Strategy {

    @Override
    public String generarSerie(int n) {
        String s = "";
        int base = 0;

        for (int i = 1; i <= n; i++) {
            base = base + i * 2;
            s = s + base + " , ";
        }
        return s;
    }
}
