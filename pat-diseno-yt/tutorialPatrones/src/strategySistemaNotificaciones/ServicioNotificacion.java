package strategySistemaNotificaciones;

public class ServicioNotificacion {

    private NotificacionStrategy notificacionStrategy;

    // constructores
    public ServicioNotificacion() {
    }

    public ServicioNotificacion(NotificacionStrategy notificacionStrategy) {
        this.notificacionStrategy = notificacionStrategy;
    }

    // setters y getters
    public NotificacionStrategy getNotificacionStrategy() {
        return notificacionStrategy;
    }

    public void setNotificacionStrategy(NotificacionStrategy notificacionStrategy) {
        this.notificacionStrategy = notificacionStrategy;
    }
    
    // otro metodo
    public void notificar(String destinatario, String mensaje) {
        notificacionStrategy.enviar(destinatario, mensaje);
    }

}
