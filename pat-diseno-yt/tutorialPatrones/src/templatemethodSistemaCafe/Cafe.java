
package templatemethodSistemaCafe;

public class Cafe extends Bebida{

    @Override
    public void hervirAgua() {
        System.out.println("Hirviendo agua a 90°C");
    }

    @Override
    public void prepararIngredientePrincipal() {
        System.out.println("Moliendo y filtrando granos de cafe");
    }

    @Override
    public void servirEnTaza() {
        System.out.println("Sirviendo cafe en taza grande");
    }

    @Override
    public void agregarExtras() {
        System.out.println("Agregando azucar y leche");
    }


}
