package arquitectura.capasSimplificado;

public class NegocioTipoProducto {

    private DatoTipoProducto dato;

    public NegocioTipoProducto() {
        dato = new DatoTipoProducto();
    }

    public int guardar(String descripcion) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            return -1;
        }
        return dato.guardar(descripcion);
    }

    public Object[][] listar() {
        return dato.listar();
    }

    public void eliminar(int id) {
        dato.eliminar(id);
    }
}
