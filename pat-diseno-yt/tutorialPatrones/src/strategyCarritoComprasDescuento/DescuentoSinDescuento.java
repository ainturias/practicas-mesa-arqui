package strategyCarritoComprasDescuento;

public class DescuentoSinDescuento implements DescuentoStrategy {

    @Override
    public double calcularDescuento(double totalCompra) {
        System.out.println("Sin Descuento");
        return 0;
    }

}
