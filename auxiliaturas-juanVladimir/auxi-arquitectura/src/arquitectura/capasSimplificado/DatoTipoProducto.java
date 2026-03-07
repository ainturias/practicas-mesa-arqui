package arquitectura.capasSimplificado;

public class DatoTipoProducto {

    private BaseDatos db;

    public DatoTipoProducto() {
        db = new BaseDatos();
    }

    public int guardar(String descripcion) {
        Object[] registro = {descripcion};
//        Object[] registro = {titulo, autor, año};  // 3 campos
        return db.guardar(registro);
    }

    public Object[][] listar() {
        return db.listar();
    }

    public void eliminar(int id) {
        db.eliminar(id);
    }
}
