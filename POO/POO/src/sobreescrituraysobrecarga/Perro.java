package sobreescrituraysobrecarga;

public class Perro extends Animal2 {

    // Implementamos a nuestra manera este método
    @Override       // es una nota que significa sobreescribir, pisar, modificar, reemplazar
    public void hacerSonido() {
        System.out.println("Soy un perro y ladro: guau guau");
    }

}
