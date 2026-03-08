package pregunta32.trescapas;

import java.util.Map;

public class NegocioPersona {

    private DatoPersona datoPersona;

    public NegocioPersona() {
        datoPersona = new DatoPersona();
    }
    
    public void cargarDatos(Map<String, Object> data) {
        datoPersona.cargarDatos(data);
    }

    public Object[] guardar() {
        return datoPersona.guardar();
    }

    public Map<String, Object[]> listar() {
        return datoPersona.listar();
    }

    public void eliminar(String id) {
        datoPersona.eliminar(id);
    }

}
