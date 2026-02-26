/*
* RELACIÓN DE 1 A MUCHOS (1 a N)

- Hacemos la relación de que 1 auto tiene muchos propietarios
- Normalmente en DB la llave va de auto hacia propietario, pero al nivel lógico es al revés.
- Se entiende como: Un auto tiene como atributo una lista de propietarios
 */
package relaciones;

import java.util.List;

public class Auto2 {

    private Long id;
    private String marca;
    private String modelo;

    private List<Propietario> listaPropietarios;
    
    // constructores

    // Tenemos que agregar esto para poder usar el .toString();
    @Override
    public String toString() {
        return "Auto2{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", listaPropietarios=" + listaPropietarios + '}';
    }
    
    public Auto2() {
    }

    public Auto2(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }
    
     
    
    
    
    
}
