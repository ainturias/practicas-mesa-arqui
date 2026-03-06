
package templatemethodSistemaReportes;

public class ReporteExcel extends Reporte{

    @Override
    public void conectarFuenteDatos() {
        System.out.println("Conectando a API REST del servidor");
    }

    @Override
    public void extraerDatos() {
        System.out.println("Extrayendo datos JSON del endpoint /ventas");
    }

    @Override
    public void formatearDatos() {
        System.out.println("Organizando datos en celdas y hojas");
    }

    @Override
    public void exportarReporte() {
        System.out.println("Exportando archivo reporte_ventas.xlsx");
    }
    
    
    
}
