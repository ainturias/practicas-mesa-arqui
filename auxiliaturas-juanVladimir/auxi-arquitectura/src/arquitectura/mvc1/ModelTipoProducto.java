package arquitectura.mvc1;

import arquitectura.capas.Database;

public class ModelTipoProducto {
    // LITERAL HEMOS COPIADO DE 3CAPAS->DATOS, SOLAMENTE HEMOS CAMBIADO EL NOMBRE
    // DEL CONSTRUCTOR

    // estos 2 atributos es lo que tengo en la capa de datos
    private String id;
    private String descripcion;

    // entra como atributo a TipoProducto
    private Database database;

    // NO OLVIDAR ESTO EN MVC
    // constructor, dice que lo hace de esta manera por que le gusta, es diferente a
    // lo que había visto.
    public ModelTipoProducto() {
        id = "";
        descripcion = "";
        database = new Database();
    }

}
