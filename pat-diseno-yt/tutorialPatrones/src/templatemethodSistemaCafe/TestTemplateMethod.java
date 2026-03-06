package templatemethodSistemaCafe;

public class TestTemplateMethod {

    public static void main(String[] args) {

        Bebida miCafe = new Cafe();
        Bebida miTe = new Te();

        System.out.println("----------------- Preparar Café -------------------");
        miCafe.templatePreparar();
        System.out.println("---------------- Preparar Té ----------------------");
        miTe.templatePreparar();

    }

}
