
package strategySistemaNotificaciones;

public class TestNotificacion {
    
    public static void main(String[] args) {
        
        ServicioNotificacion servicio = new ServicioNotificacion(new NotificacionEmail());
        
        servicio.notificar("Alex", "que haces?");
        
        servicio.setNotificacionStrategy(new NotificacionWhatsapp());
        
        servicio.notificar("Deibid", "donde estás?");
        
    }
    
    
    
}
