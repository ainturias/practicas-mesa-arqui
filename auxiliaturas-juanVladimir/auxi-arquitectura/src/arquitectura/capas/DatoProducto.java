
package arquitectura.capas;

public class DatoProducto {
    
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
    public DatoProducto() {
        this.id = "";
        this.codigo = "";
        this.nombre = "";
        this.precio = 0;
        this.tipo_producto_id = "";
        this.database = new Database();
    }
    
    
    
    
    
}
