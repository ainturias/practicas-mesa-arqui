package strategyCarritoComprasDescuento;

public class DescuentoFijo implements DescuentoStrategy {

    private final double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double calcularDescuento(double totalCompra) {
        System.out.println("Descuento Fijo");
        return montoFijo;
    }

}
