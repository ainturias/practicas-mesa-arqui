package arquitectura.capas;

public class DatoTipoProducto {

    // estos 2 atributos es lo que tengo en la capa de datos
    private String id;
    private String descripcion;
    
    // entra como atributo a TipoProducto
    private Database database;

    // constructor, dice que lo hace de esta manera por que le gusta, es diferente a lo que había visto.
    public DatoTipoProducto() {
        database = new Database();
    }

}
