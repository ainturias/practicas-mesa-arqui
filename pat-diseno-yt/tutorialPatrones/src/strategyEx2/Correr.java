package strategyEx2;

// ====================================================
// PASO 2b: Otra estrategia CONCRETA
// ====================================================
// Otra clase que también "cumple el contrato".
// Tiene el mismo método ejecutar(), pero HACE ALGO DIFERENTE.
// ====================================================

public class Correr implements Estrategia {

    @Override
    public void ejecutar() {
        System.out.println("🏃 Estoy corriendo rápido!");
    }
}
