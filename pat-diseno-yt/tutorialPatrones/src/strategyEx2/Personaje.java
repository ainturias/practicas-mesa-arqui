package strategyEx2;

// ====================================================
// PASO 3: El CONTEXTO (quien USA la estrategia)
// ====================================================
// Esta clase NO sabe si va a caminar o correr.
// Solo sabe que tiene "una estrategia" y la puede ejecutar.
//
// Esto responde tu duda principal:
// ¿Por qué en Enemy se ponía new UnarmedAttack()?
// → Era solo un valor por defecto para que no esté vacío (null).
//
// AQUÍ lo hacemos MÁS SIMPLE: no ponemos valor por defecto.
// En su lugar, le pasamos la estrategia directamente al crear el personaje.
// ====================================================

public class Personaje {

    private String nombre;

    // Esta variable puede guardar CUALQUIER objeto que implemente Estrategia.
    // Puede ser un Caminar, un Correr, o cualquier otra cosa que la implemente.
    // A esto se le llama POLIMORFISMO.
    private Estrategia estrategia;

    // Constructor: le pasamos el nombre Y la estrategia que queremos.
    // Así no necesitamos un "new UnarmedAttack()" por defecto.
    public Personaje(String nombre, Estrategia estrategia) {
        this.nombre = nombre;
        this.estrategia = estrategia;
    }

    // Este método es el equivalente a "attackStrategy.attack(player)" de tu
    // ejemplo.
    //
    // ¿Qué hace? → Le dice al objeto "estrategia": "ejecuta lo que tú sepas hacer".
    //
    // Si estrategia = Caminar → imprime "Estoy caminando..."
    // Si estrategia = Correr → imprime "Estoy corriendo!"
    //
    // El Personaje NO SABE cuál es. Solo llama a ejecutar() y Java
    // busca automáticamente el método correcto. ESO es polimorfismo.
    public void realizarAccion() {
        System.out.println(nombre + " va a realizar su acción:");
        estrategia.ejecutar();
    }

    // Con este método puedes CAMBIAR la estrategia en cualquier momento.
    // Es la clave del patrón: cambiar comportamiento SIN modificar la clase.
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
}
