package dip;

public class CentralNotificacoes {
    private Notificador notificador;

    // Injeção da abstração via construtor
    public CentralNotificacoes(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificarCliente(String mensagem) {
        notificador.enviar(mensagem);
    }
}
