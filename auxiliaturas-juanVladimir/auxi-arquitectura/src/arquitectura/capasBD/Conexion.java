package arquitectura.capasBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    private Connection conn;

    public Conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:tienda.db");
            crearTabla();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS tipo_producto (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "descripcion TEXT)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int guardar(String descripcion) {
        String sql = "INSERT INTO tipo_producto (descripcion) VALUES (?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, descripcion);
            ps.executeUpdate();
            return ultimoId();
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public String[][] listar() {
        String sql = "SELECT * FROM tipo_producto";
        String[][] datos = new String[100][2];
        int fila = 0;
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                datos[fila][0] = rs.getString("id");
                datos[fila][1] = rs.getString("descripcion");
                fila++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM tipo_producto WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int ultimoId() {
        String sql = "SELECT last_insert_rowid()";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
