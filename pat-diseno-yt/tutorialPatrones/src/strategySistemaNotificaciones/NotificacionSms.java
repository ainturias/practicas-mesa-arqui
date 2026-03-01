package strategySistemaNotificaciones;

public class NotificacionSms implements NotificacionStrategy {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a: " + destinatario + " : " + mensaje);
    }

}
