package claseabstracta;

// aquí añadiendo el abstract estamos diciendo que esta clase va a ser abstracta.
// un cambio visual es que el ícono del archivo en la parte izquierda se pone en gris y significa que es una clase abstracta.
public abstract class Figura {

    protected double x;     //pos en x
    protected double y;     //pos en y

    // ¿En una clase abstracta pueden haber constructores?
    // sí, pueden haber constructores, pero esos constructores van a ser utilizados unicamente por sus hijas.
    // Tener en cuenta ciertos detalles, como cambiar el modificador de acceso de public a protected para que solamente sus hijas puedan verlo.
    protected Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // estamos diciendo que el método que vamos a crear va a ser abstracto
    // una regla es tener almenos un método abstracto.
    public abstract double calcularArea();

}
