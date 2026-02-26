
/*
* RELACIÓN DE 1 A 1
 */
package relaciones;

public class Auto {

    // atributos
    private Long id;
    private String marca;
    private String modelo;

    private Propietario prop;   // relación de 1 a 1

    // constructores
    public Auto() {
    }

    // luego de añadir la relación, tenemo que actualizar el constructor.
    public Auto(Long id, String marca, String modelo, Propietario prop) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
    }

    public Propietario getProp() {
        return prop;
    }

    // metodos setters and getters
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

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

}
