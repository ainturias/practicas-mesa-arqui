package strategy;

public class Player {

    private String nombre;
    private int salud;

    public Player(String nombre) {
        this.nombre = nombre;
        this.salud = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

}
