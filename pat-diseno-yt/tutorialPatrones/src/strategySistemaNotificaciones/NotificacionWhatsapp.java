package strategySistemaNotificaciones;

public class NotificacionWhatsapp implements NotificacionStrategy {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando WHATSAPP a: " + destinatario + " : " + mensaje);
    }

}
