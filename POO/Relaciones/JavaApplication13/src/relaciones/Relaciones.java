package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {

        /*
        // 1 a 1
        Propietario p1 = new Propietario(1L, "Alex", "Inturias");
        Auto a1 = new Auto(1L, "Toyota", "Prado", p1);
        System.out.println("Dueño del auto:" + a1.getProp().getNombre());
         */
        
        // 1 a N
        Auto2 auto1 = new Auto2();
        auto1.setId(1L);
        auto1.setMarca("Toyota");
        auto1.setModelo("Runner");

        List<Propietario> listaPropietarios = new ArrayList<Propietario>();

        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(40L);
        prop1.setNombre("Deibid");
        prop1.setApellido("Banegas");

        prop2.setId(70L);
        prop2.setNombre("Cristhian");
        prop2.setApellido("Alvarez");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        auto1.setListaPropietarios(listaPropietarios);

        System.out.println("El auto " + auto1.getMarca() + " " + auto1.getModelo()
                + "tiene como propietarios a " + auto1.getListaPropietarios().toString());

    }
}
