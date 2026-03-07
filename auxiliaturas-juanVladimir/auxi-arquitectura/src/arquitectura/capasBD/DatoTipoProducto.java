package arquitectura.capasBD;

public class DatoTipoProducto {

    private Conexion conexion;

    public DatoTipoProducto() {
        conexion = new Conexion();
    }

    public int guardar(String descripcion) {
        return conexion.guardar(descripcion);
    }

    public String[][] listar() {
        return conexion.listar();
    }

    public void eliminar(int id) {
        conexion.eliminar(id);
    }
}
