package interfaces;

// cambiamos la palabra "extends" por "implements"
// para usar las otras interfaces las añadimos separadas por coma, y luego nos dice que tenemos que añadir sus metodos abstractos
public class Cuadrado implements Figura, Dibujable {

    private double lado;

    // constructor
    public Cuadrado() {
    }

    // creamos su constructor propio
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override       // -> significa sobreescritura, del concepto de sobreescritura de métodos.
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un cuadrado");
    }

}
