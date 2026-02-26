
package sobreescrituraysobrecarga;

public class Animal {
    
    private int id_animal;
    private String descripcion;
    
    // Constructores
    
    // Métodos: Setters and Getters
    
    // Otros métodos
    public void hacerSonido () {
        System.out.println("El animal hace un sonido");
    }
    
    public void hacerSonido (String nombre_animal) {
        System.out.println("El animal " + nombre_animal + "hace un sonido");
    }
    
    public void hacerSonido (String nombre_animal, String tipoSonido) {
        System.out.println("El animal " + nombre_animal + "hace un sonido de tipo " + tipoSonido);
    }
    
}
