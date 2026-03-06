package templatemethodSistemaReportes;

public abstract class Reporte {

    public abstract void conectarFuenteDatos();

    public abstract void extraerDatos();

    public abstract void formatearDatos();

    public void agregarEncabezado() {
        System.out.println("=== REPORTE GENERADO ===");
    }

    public abstract void exportarReporte();

    //-----------------------------
    public final void generarReporte(){
        conectarFuenteDatos();
        exportarReporte();
        formatearDatos();
        agregarEncabezado();
        exportarReporte();
    }
    
    
    
}
