package strategyEx2;

// ====================================================
// PASO 2a: Una estrategia CONCRETA
// ====================================================
// Esta clase "cumple el contrato" de Estrategia.
// Es decir, IMPLEMENTA la interfaz y define QUÉ HACE ejecutar().
// ====================================================

public class Caminar implements Estrategia {

    @Override
    public void ejecutar() {
        System.out.println("🚶 Estoy caminando lentamente...");
    }
}
