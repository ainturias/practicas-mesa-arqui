package strategyCarritoComprasDescuento;

public class CarritoCompras {

    private double total;
    private DescuentoStrategy descuentoStrategy;

    public CarritoCompras() {
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public DescuentoStrategy getDescuentoStrategy() {
        return descuentoStrategy;
    }

    public void setDescuentoStrategy(DescuentoStrategy descuentoStrategy) {
        this.descuentoStrategy = descuentoStrategy;
    }

    //------------------------------------------------------------------------
    public void agregarProducto(String nombre, double precio) {
        System.out.println("Producto: " + nombre + " precio " + precio);
        total = total + precio;
    }

    public void calcularTotal() {
        double descuento = descuentoStrategy.calcularDescuento(total);
        double totalFinal = total - descuento;
        System.out.println("Total: " + this.total);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total final: " + totalFinal);
    }

}
