package strategyEx2;

// ====================================================
// PASO 4: El TEST (para ver cómo funciona todo junto)
// ====================================================

public class TestStrategyEx2 {

    public static void main(String[] args) {

        // Creo un personaje que CAMINA (le paso la estrategia Caminar)
        Personaje juan = new Personaje("Juan", new Caminar());

        // Juan realiza su acción → como tiene Caminar, va a caminar
        juan.realizarAccion();
        // Salida esperada:
        // Juan va a realizar su acción:
        // 🚶 Estoy caminando lentamente...

        System.out.println("----------------------------");

        // ¡CAMBIO DE ESTRATEGIA! Ahora Juan va a correr
        // No modifiqué la clase Personaje ni la clase Caminar.
        // Solo le di un NUEVO OBJETO de tipo Correr.
        juan.setEstrategia(new Correr());

        // Juan realiza su acción → ahora tiene Correr, va a correr
        juan.realizarAccion();
        // Salida esperada:
        // Juan va a realizar su acción:
        // 🏃 Estoy corriendo rápido!

        System.out.println("----------------------------");

        // Puedo crear otro personaje con otra estrategia desde el inicio
        Personaje maria = new Personaje("Maria", new Correr());
        maria.realizarAccion();
        // Salida esperada:
        // Maria va a realizar su acción:
        // 🏃 Estoy corriendo rápido!
    }
}
