package arquitectura.mvc1;

public class ControllerProducto {

    private ViewProducto view;
    private ModelProducto model;
    private ModelTipoProducto tipoProductoModel;

    // Constructor
    public ControllerProducto() {
        this.view = new ViewProducto();
        this.model = new ModelProducto();
        this.tipoProductoModel = new ModelTipoProducto();
    }

    //para que se vea el formulario -> NO OLVIDAR ESTO
    public void showForm() {
        this.view.setVisible(true);
    }
    
    public void cargarTipoProducto() {
        
    }

}
