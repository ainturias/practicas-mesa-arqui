package arquitectura.mvc1;

public class ControllerProducto {

    // modelo
    private ModelProducto modelProducto;
    private ModelTipoProducto modelTipoProducto;

    // vista
    private ViewProducto viewProducto;

    // constructor sin parámetros
    public ControllerProducto() {
        this.modelProducto = new ModelProducto();
        this.modelTipoProducto = new ModelTipoProducto();
        this.viewProducto = new ViewProducto();
    }

    // constructor que recibe el modelo de tipo producto compartido
    public ControllerProducto(ModelTipoProducto modelTipoProducto) {
        this.modelProducto = new ModelProducto();
        this.modelTipoProducto = modelTipoProducto;
        this.viewProducto = new ViewProducto();
    }

    // NO OLVIDAR ESTO EN MVC
    // constructor, dice que lo hace de esta manera por que le gusta, es diferente a
    // lo que había visto.
    public void showForm() {
        this.viewProducto.setVisible(true);
    }

    // función
    public void cargarTipoProducto() {

    }

}
