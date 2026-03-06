
package templatemethod;

public class TestTemplateMethod {

    public static void main(String[] args) {

        // POLIMORFISMO en acción:
        // Lado izquierdo: "Template" → el tipo de la variable (el tipo general/abstracto).
        //   Solo sabemos que tiene step1(), step2(), stepN() y template().
        // Lado derecho: "new ConcreteTemplateA()" → el objeto REAL que se crea en memoria.
        //   Este es el que tiene la implementación concreta de cada paso.
        //
        // ¿Por qué hacemos esto? Porque si mañana creamos un ConcreteTemplateB,
        // solo cambiamos el "new" y todo lo demás sigue funcionando igual:
        //   Template templateA = new ConcreteTemplateB();
        Template templateA = new ConcreteTemplateA();

        // Llama al método template() de la clase Template (el padre).
        // Ese método es "final", así que SIEMPRE ejecuta los pasos en orden:
        //   1. step1() → busca la implementación en ConcreteTemplateA → imprime "step 1 class A"
        //   2. step2() → busca la implementación en ConcreteTemplateA → imprime "step 2 class A"
        //   3. stepN() → busca la implementación en ConcreteTemplateA → imprime "step N class A"
        templateA.template();

    }

}
