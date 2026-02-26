package interfaces;

// cambiamos la palabra "extends" por "implements"
// implementamos las 3 interfaces que usaremos y luego teneños que añadir sus métodos
public class Circulo implements Figura, Dibujable, Rotable {

    private double radio;

    // constructor 
    public Circulo() {
    }

    // creamos su constructor propio
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy rotando un circulo");
    }

}
