package arquitectura.mvc1;

public class ControllerTipoProducto {

    private ModelTipoProducto modelTipoProducto;
    private ViewTipoProducto viewTipoProducto;

    public ControllerTipoProducto() {
        this.modelTipoProducto = new ModelTipoProducto();
        this.viewTipoProducto = new ViewTipoProducto();
    }

    // No nos tenemos que olvidar colocar para que se vea el formulario.
    public void showForm() {
        this.viewTipoProducto.setVisible(true);
    }

}
