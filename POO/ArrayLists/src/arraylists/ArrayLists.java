package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        //otra manera es:
//        Persona perso = new Persona(1, "Alex", 27);
//        lista.add(perso);

        // Inicializar el arraylist 
        List<Persona> lista = new ArrayList<Persona>();
        // Agregar nuevos elementos: 
        lista.add(new Persona(1, "Alex", 27));
        lista.add(new Persona(2, "Nelson", 25));
        lista.add(new Persona(3, "David", 24));
        lista.add(new Persona(4, "Michel", 21));
        lista.add(new Persona(5, "Boris", 23));
        
        //recorrer por índice
        System.out.println("----------------- FOR -----------------------");
        for (int i = 0; i<lista.size(); i++){
            System.out.println("prueba: " + lista.get(i).getNombre());
        }
        System.out.println("------------------- FOREACH ------------------");
        // recorrer elemento por elemento / foreach
        for (Persona perso:lista) {
            System.out.println("prueba: " + perso.getNombre());
        }
        
        
        
    }

}
