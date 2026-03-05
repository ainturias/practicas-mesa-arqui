package arquitectura.mvc1;

import arquitectura.capas.Database;

public class ModelProducto {
    //LITERAL HEMOS COPIADO DE 3CAPAS->DATOS, SOLAMENTE HEMOS CAMBIADO EL NOMBRE DEL CONSTRUCTOR

    // atributos que tenemos que poner mirando el diagrama procedimental
    private String id;
    private String codigo;
    private String nombre;
    private double precio;

    // por la relacion de 1 -> muchos, entra como llave foranea
    private String tipo_producto_id;

    // database viene como atributo a datoProducto
    private Database database;

    // constructor
    public ModelProducto() {
        this.id = "";
        this.codigo = "";
        this.nombre = "";
        this.precio = 0;
        this.tipo_producto_id = "";
        this.database = new Database();
    }

}
