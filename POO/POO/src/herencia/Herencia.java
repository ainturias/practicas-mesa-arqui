package herencia;

public class Herencia {

    public static void main(String[] args) {

        // -------------- HERENCIA ------------------
        Empleado empleado = new Empleado();
        empleado.getNum_legajo();     //este pertenece a la clase Empleado
        empleado.getNombre();           //este pertenece a la clase Persona

        Consultor consultor = new Consultor();
        consultor.getNombre_consultora();
        consultor.getNombre();
        
        // ---------- POLIMORFISMO --------------
        Persona vector [] = new Persona [5];
        vector [0] = new Persona ();
        vector [1] = new Jefe();
        vector [2] = new Consultor();
        vector [3] = new Empleado();
//        vector [4] = "Hola";     //ya no nos deja mesclar los tipos. Java no permite eso. En este caso deja por que persona es el padre y los otros son sus clases hijas.
        
        Persona perso = new Persona();
        Consultor consul = new Consultor();
        
        perso = consul;     // se puede por que: asignamos un hijo a su papá.
//        consul = perso;     // no se puede asignar un padre a su hijo.
        
        

    }

}
