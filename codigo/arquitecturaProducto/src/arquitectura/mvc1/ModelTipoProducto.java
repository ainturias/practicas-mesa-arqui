package arquitectura.mvc1;

import arquitectura.capas.Database;

public class ModelTipoProducto {

    private String id;
    private String descripcion;
    private Database database;

    // Constructor
    public ModelTipoProducto() {
        this.database = new Database();
        id = "";
        descripcion = "";
    }
}
