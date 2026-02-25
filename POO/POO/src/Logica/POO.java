package Logica;

public class POO {

    public static void main(String[] args) {

        // Estamos llamando al constructor vacío.
        Alumno alumno1 = new Alumno();

        // Estamos llamando al constructor con parametros y le estamos pasando parametros.
        Alumno alumno2 = new Alumno(35, "Alexander", "Inturias");

        // Mostrar datos por pantalla
        System.out.println("La id del alumno 2 es: " + alumno2.getId());
        System.out.println("El nombre del alumno 2 es: " + alumno2.getNombre());
        System.out.println("El apellido del alumno 2 es: " + alumno2.getApellido());

        alumno1.setId(10);
        alumno1.setNombre("Fernando");
        alumno1.setApellido("Carrasco");

        System.out.println("-------------------------------------------");
        System.out.println("La id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre del alumno 1 es: " + alumno1.getNombre());
        System.out.println("El apellido del alumno 1 es: " + alumno1.getApellido());
        
        System.out.println("-------------------------------------------");
        alumno2.setId(4);
        System.out.println("El nuevo dato: " + alumno2.getId());
        
    }

}
