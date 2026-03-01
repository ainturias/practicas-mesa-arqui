package strategySistemaNotificaciones;

public class NotificacionEmail implements NotificacionStrategy {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando EMAIL a: " + destinatario + " : " + mensaje);
    }

}
