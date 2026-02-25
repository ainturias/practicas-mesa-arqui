package Logica;

public class Alumno {

    // Atributos / Características
    // Estas pertenecen o son variables globales.
    int id;
    String nombre;
    String apellido;

    // Constructores

    // Constructor de tipo vacío
    public Alumno() {
    }

    // Constructor con todos los parametros
    // En cambio estas son variables locales.
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
    
    // Métodos -> funciones o acciones
    // Conocidos como objetos.
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public void saberAprobado(double calificacion) {
        if (calificacion >= 6) {
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Reprobé la materia");
        }
    }
    

    
    

    
    
    
}
