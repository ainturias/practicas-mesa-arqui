package pregunta32.trescapas;

import java.util.Map;

public class DatoPersona {

    private String id;
    private String nombrecompleto;
    private String nacionalidad;
    private String fecha;

    private Database database;

    public DatoPersona() {
        id = "";
        nombrecompleto = "";
        nacionalidad = "";
        fecha = "";

        database = new Database();
    }

    public void cargarDatos(Map<String, Object> data) {
        id = data.get("id").toString();
        nombrecompleto = data.get("nombrecompleto").toString();
        nacionalidad = data.get("nacionalidad").toString();
        fecha = data.get("fecha").toString();
    }

    public Object[] guardar() {
        Object[] data = {id, nombrecompleto, fecha, nacionalidad};
        return database.store(data);
    }

    public Map<String, Object[]> listar() {
        return database.list();
    }

    public void eliminar(String id) {
        database.delete(id);
    }

}
