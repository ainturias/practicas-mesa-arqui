package pregunta32.memento;

public class Originator {

    private String nombreCompleto;

    public void setMemento(Memento memento) {
        this.nombreCompleto = memento.getNombreCompleto();  // GET
    }

    public Memento crearMemento() {
        Memento memento = new Memento();
        memento.setNombreCompleto(nombreCompleto);  // SET
        return memento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

}
