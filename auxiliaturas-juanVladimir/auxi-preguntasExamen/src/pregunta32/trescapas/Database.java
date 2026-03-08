package pregunta32.trescapas;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private int primaryKey;
    private Map<String, Object[]> rows;

    public Database() {
        this.primaryKey = 0;
        this.rows = new HashMap<>();
    }

    // guardar
    public Object[] store(Object[] data) {
        if (data[0].toString().isEmpty()) {
            this.primaryKey++;
            data[0] = this.primaryKey;
        }
        this.rows.put(data[0].toString(), data);
        return data;
    }

    public void delete(String id) {
        this.rows.remove(id);
    }

    // buscar un objeto en el hash map
    public Object[] find(String id) {
        return this.rows.get(id);
    }

    // listar
    public Map<String, Object[]> list() {
        return this.rows;
    }

}
