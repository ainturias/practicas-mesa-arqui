
package templatemethodSistemaReportes;

public class ReportePDF extends Reporte {

    @Override
    public void conectarFuenteDatos() {
        System.out.println("Conectando a base de datos MySQL");
    }

    @Override
    public void extraerDatos() {
        System.out.println("Ejecutando query SELECT * FROM ventas");
    }

    @Override
    public void formatearDatos() {
        System.out.println("Formateando datos en tablas con bordes");
    }

    @Override
    public void exportarReporte() {
        System.out.println("Exportando archivo reporte_ventas.pdf");
    }
    
}
