package arraylistslinkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Persona> listaArray = new ArrayList<Persona>();
        // Agregar nuevos elementos: 
        listaArray.add(new Persona(1, "Alex", 27));
        listaArray.add(new Persona(2, "Nelson", 25));
        listaArray.add(new Persona(3, "David", 24));
        listaArray.add(new Persona(4, "Michel", 21));

        List<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "AAAA", 20));
        listaLinked.add(new Persona(2, "BBBB", 21));
        listaLinked.add(new Persona(3, "CCCC", 22));
        listaLinked.add(new Persona(4, "DDDD", 23));

        // Remove en ArrayList
        listaArray.remove(1);

        // Remove en LinkedList
        String nombreBorrar = "BBBB";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break; //corto qeu deje de correr
            }
        }

        System.out.println("------------------- LUEGO DE ELIMINAR ------------------------");
        // recorrido foreach
        System.out.println("------------ ArrayList --------------");
        for (Persona persona : listaArray) {
            System.out.println("Prueba: " + persona.getNombre());
        }

        System.out.println("----------- LinkedList -------------------");
        for (Persona persona : listaLinked) {
            System.out.println("Prueba: " + persona.getNombre());
        }

        // Tamaño de lista
        System.out.println("---------- Qué tamaño tiene las listas? -----------------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());

        // obtener primer objeto
        System.out.println("---------------- Primer y Último OBJETO (solo para linked list) --------------");
        System.out.println("Primero de linkedlist: " + listaLinked.getFirst().toString());
        System.out.println("Último de linkedlist: " + listaLinked.getLast().toString());

        // borrar toda la lista
        System.out.println("-------------- Borrando Listas ----------------");
        listaArray.clear();
        listaLinked.clear();

        // comprobar si está vacía
        System.out.println("----------------- Está vacía alguna lista? -----------------");
        System.out.println("ArrayLIst: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());

    }

}
