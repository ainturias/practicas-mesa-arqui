package strategyEx2;

// ====================================================
// PASO 1: La INTERFAZ (el "contrato")
// ====================================================
// Esta interfaz dice: "cualquier clase que me implemente
// DEBE tener un método llamado ejecutar()"
//
// Piénsalo como un enchufe de pared:
// No importa si conectas una lámpara, un TV o un ventilador,
// todos deben tener el mismo tipo de clavija para conectarse.
// ====================================================

public interface Estrategia {
    void ejecutar();
}
