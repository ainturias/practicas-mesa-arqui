
/*
- Hemos copiado y pegado los archivos del proyecto "ArrayLists".
- Lo que vamos a hacer es a modificar el codigo que tenemos en el proyecto "ArrayLists".
- Vamos a adaptar este codigo y hacerlo para que sea un Linkedlists o lista enlazada.
*/

package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {

        //otra manera es:
//        Persona perso = new Persona(1, "Alex", 27);
//        lista.add(perso);

        // Inicializar el arraylist 
        List<Persona> lista = new LinkedList<Persona>();
        
        // Agregar nuevos elementos al final de la lista
        lista.add(new Persona(1, "Alex", 27));
        lista.add(new Persona(2, "Nelson", 25));
        lista.add(new Persona(3, "David", 24));
        lista.add(new Persona(4, "Michel", 21));
        lista.add(new Persona(5, "Boris", 23));
        
        // agregar al principio de la lista
        // solamente añadimos el número "0" para indicar el inicio/principio.
        lista.add(0, new Persona(6, "Ricardo", 50));
        
        System.out.println("------------------- FOREACH ------------------");
        // recorrer elemento por elemento / foreach
        for (Persona perso:lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
        
        
        
    }

}
