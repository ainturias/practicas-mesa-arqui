
package arquitectura.capas;

public class DatoProducto {
    
    private String id;
    private String codigo;
    private String nombre;
    private double precio;
    
    private String tipo_producto_id;
    
    private Database database; 
    
    //Constructor
    public DatoProducto () {
        this.id = "";
        this.codigo = "";
        this.nombre = "";
        this.precio = 0;
        this.tipo_producto_id = "";
        this.database = new Database();
    }
    
    
    
    
    
}
