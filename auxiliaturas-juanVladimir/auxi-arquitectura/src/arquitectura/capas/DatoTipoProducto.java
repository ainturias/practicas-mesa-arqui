package arquitectura.capas;

import java.util.Map;

public class DatoTipoProducto {

    // estos 2 atributos es lo que tengo en la capa de datos
    private String id;
    private String descripcion;

    // entra como atributo a TipoProducto
    private Database database;

    // constructor, dice que lo hace de esta manera por que le gusta, es diferente a lo que había visto.
    public DatoTipoProducto() {
        id = "";
        descripcion = "";
        database = new Database();
    }

    public void cargarDatos(Map<String, Object> data) {
        id = data.get("id").toString();
        descripcion = data.get("descripcion").toString();
    }

    public Object[] guardar() {
        Object[] data = {id, descripcion};
        return database.store(data);
    }

    public Map<String, Object[]> listar() {
        return database.list();
    }

    public void eliminar(String id) {
        database.delete(id);
    }

}
