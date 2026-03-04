package patterns;

public class SerieA implements Strategy {

    @Override
    public String generarSerie(int n) {
        String s = "";
        int x = 0;
        
        for (int i = 1; i <= n; i++) {
            x = x + i;
            s = s + Integer.toString(x) + " , ";
        }
        return s;
    }

}
