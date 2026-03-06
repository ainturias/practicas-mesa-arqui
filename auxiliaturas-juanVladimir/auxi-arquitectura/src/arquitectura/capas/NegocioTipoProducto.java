package arquitectura.capas;

import java.util.Map;

public class NegocioTipoProducto {

    private DatoTipoProducto datoTipoProducto;

    // constructor, dice que lo hace de esta manera por que le gusta, es diferente a lo que había visto.
    public NegocioTipoProducto() {
        datoTipoProducto = new DatoTipoProducto();
    }
    
    public void cargarDatos(Map<String, Object> data) {
        datoTipoProducto.cargarDatos(data);
    }

    public Object[] guardar() {
        return datoTipoProducto.guardar();
    }

    public Map<String, Object[]> listar() {
        return datoTipoProducto.listar();
    }

    public void eliminar(String id) {
        datoTipoProducto.eliminar(id);
    }

}
