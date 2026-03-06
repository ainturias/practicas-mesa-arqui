
package templatemethodSistemaCafe;

public class Te extends Bebida {

    @Override
    public void hervirAgua() {
        System.out.println("Hirviendo agua a 70°C");
    }

    @Override
    public void prepararIngredientePrincipal() {
        System.out.println("Infusionando hojas de té por 3 minutos");
    }

    @Override
    public void servirEnTaza() {
        System.out.println("Sirviendo té en taza de porcelana");
    }

    @Override
    public void agregarExtras() {
        System.out.println("Agregando miel y limón");
    }
    
}
