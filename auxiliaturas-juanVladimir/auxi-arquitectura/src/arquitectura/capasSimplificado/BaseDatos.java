package arquitectura.capasSimplificado;

import java.util.HashMap;
import java.util.Map;

public class BaseDatos {

    private int idAutoIncrement;
    private Map<Integer, Object[]> datos;

    public BaseDatos() {
        this.idAutoIncrement = 0;
        this.datos = new HashMap<>();
    }

    public int guardar(Object[] registro) {
        idAutoIncrement++;
        datos.put(idAutoIncrement, registro);
        return idAutoIncrement;
    }

    public Object[][] listar() {
        Object[][] resultado = new Object[datos.size()][];
        int i = 0;
        for (Object[] reg : datos.values()) {
            resultado[i] = reg;
            i++;
        }
        return resultado;
    }

    public void eliminar(int id) {
        datos.remove(id);
    }

    public Object[] buscar(int id) {
        return datos.get(id);
    }
}
