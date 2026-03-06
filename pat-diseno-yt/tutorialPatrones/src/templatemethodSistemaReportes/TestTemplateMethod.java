package templatemethodSistemaReportes;

public class TestTemplateMethod {

    public static void main(String[] args) {

        Reporte repExcel = new ReporteExcel();
        Reporte repPDF = new ReportePDF();

        System.out.println("-------------- REPORTE EXCEL ----------------");
        repExcel.generarReporte();
        System.out.println("------------- REPORTE PDF --------------------");
        repPDF.generarReporte();

    }

}
