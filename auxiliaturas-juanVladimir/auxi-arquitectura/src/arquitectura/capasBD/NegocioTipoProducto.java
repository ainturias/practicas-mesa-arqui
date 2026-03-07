package arquitectura.capasBD;

public class NegocioTipoProducto {

    private DatoTipoProducto datoTipoProducto;

    public NegocioTipoProducto() {
        datoTipoProducto = new DatoTipoProducto();
    }

    public int guardar(String descripcion) {
        if (descripcion.isEmpty()) {
            return -1;
        }
        return datoTipoProducto.guardar(descripcion);
    }

    public String[][] listar() {
        return datoTipoProducto.listar();
    }

    public void eliminar(int id) {
        datoTipoProducto.eliminar(id);
    }
}
