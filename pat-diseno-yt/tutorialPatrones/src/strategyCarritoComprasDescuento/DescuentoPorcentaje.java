package strategyCarritoComprasDescuento;

public class DescuentoPorcentaje implements DescuentoStrategy {

    private final int porcentaje;

    public DescuentoPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(double totalCompra) {
        System.out.println("Descuento Porcentaje");
        return totalCompra * (porcentaje / 100.0);
    }

}
