package encapsulamiento;

public class Alumno {

    //atributos
    // por estandar todos los atributos de una clase tienen que ser privados.
    // ¿por que?: para protegerlos de que no cualquier otra clase pueda acceder a ellos y que nos obligue a utilizar los setters y getters para poder establecer los valores.
    private int id;
    private String nombre;
    private String apellido;

    //constructores
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //métodos setters and getters
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

}
