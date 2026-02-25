package arquitectura.mvc1;

import arquitectura.capas.Database;

public class ControllerTipoProducto {

    private ModelTipoProducto model;
    private ViewTipoProducto view;

    public ControllerTipoProducto() {
        this.model = new ModelTipoProducto();
        this.view = new ViewTipoProducto();
    }
    
    //para que se vea el formulario -> NO OLVIDAR ESTO
    public void showForm(){
        this.view.setVisible(true);
    }
    

}
