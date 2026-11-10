package dip;

public class WhatsAppNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}
