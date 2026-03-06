package templatemethodSistemaCafe;

public abstract class Bebida {

    // Métodos abstractos
    public abstract void hervirAgua();

    public abstract void prepararIngredientePrincipal();

    public abstract void servirEnTaza();
    
    public abstract void agregarExtras();
    
    // Método plantilla
    public final void templatePreparar(){
        hervirAgua();
        prepararIngredientePrincipal();
        servirEnTaza();
        agregarExtras();
    }

}
