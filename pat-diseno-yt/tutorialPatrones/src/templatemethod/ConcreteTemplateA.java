
package templatemethod;

// Clase CONCRETA: hereda de Template y está OBLIGADA a implementar
// los 3 métodos abstractos (step1, step2, stepN).
// Acá es donde definimos QUÉ hace cada paso para esta implementación específica.
public class ConcreteTemplateA extends Template {

    // @Override indica que estamos sobreescribiendo un método de la clase padre.
    // Si escribimos mal el nombre del método, Java nos avisa del error.
    @Override
    public void step1() {
        // Implementación específica del paso 1 para la clase A
        System.out.println("step 1 class A");
    }

    @Override
    public void step2() {
        // Implementación específica del paso 2 para la clase A
        System.out.println("step 2 class A");
    }

    @Override
    public void stepN() {
        // Implementación específica del paso N para la clase A
        System.out.println("step N class A");
    }

}
