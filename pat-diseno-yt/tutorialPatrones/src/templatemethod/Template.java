
package templatemethod;

// Clase ABSTRACTA: no se puede instanciar directamente (no podés hacer new Template()).
// Sirve como "molde" que define los pasos del algoritmo,
// pero OBLIGA a las subclases a implementar cada paso.
public abstract class Template {

    // Métodos abstractos: solo tienen la firma, NO tienen cuerpo {}.
    // Cualquier clase que herede de Template DEBE implementarlos.
    public abstract void step1();

    public abstract void step2();

    public abstract void stepN();

    // MÉTODO PLANTILLA (Template Method) — el corazón del patrón.
    // "final" significa que NADIE puede sobreescribirlo en las subclases.
    // Esto garantiza que el ORDEN de los pasos siempre sea: step1 → step2 → stepN.
    // Las subclases definen QUÉ hace cada paso, pero NO pueden cambiar el ORDEN.
    public final void template() {
        step1();  // Ejecuta el step1() de la subclase concreta
        step2();  // Ejecuta el step2() de la subclase concreta
        stepN();  // Ejecuta el stepN() de la subclase concreta
    }

}
