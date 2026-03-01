package strategyCarritoComprasDescuento;

public class TestDescuento {
    
    public static void main(String[] args) {
        
        CarritoCompras carrito1 = new CarritoCompras();
        
        carrito1.agregarProducto("Zanahoria", 15.0);
        carrito1.agregarProducto("papa", 3.30);
        carrito1.agregarProducto("lechuga", 30);
        carrito1.agregarProducto("zapallo", 40);
        
        System.out.println("======================================");

        // SIN DESCUENTO
        carrito1.setDescuentoStrategy(new DescuentoSinDescuento());
        carrito1.calcularTotal();
        
        System.out.println("=======================================");

        // DESCUENTO FIJO
        carrito1.setDescuentoStrategy(new DescuentoFijo(10));
        carrito1.calcularTotal();
        
        System.out.println("=======================================");

        // DESCUENTO PORCENTAJE
        carrito1.setDescuentoStrategy(new DescuentoPorcentaje(15));
        carrito1.calcularTotal();
        
    }
    
}
