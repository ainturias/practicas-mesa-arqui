package claseabstracta;

// tenemos que añadir el extends para decir que son clases hijas
public class Cuadrado extends Figura {

    private double lado;

    // constructor
    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    @Override       // -> significa sobreescritura, del concepto de sobreescritura de métodos.
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

}
