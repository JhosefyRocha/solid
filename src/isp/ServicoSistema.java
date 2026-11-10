package isp;

public class ServicoSistema implements GerenciavelPedido, GerenciavelEntrega {
    @Override
    public void gerenciarPedido() {
        System.out.println("Gerenciando processo de pedido.");
    }

    @Override
    public void gerenciarEntrega() {
        System.out.println("Gerenciando rota de entrega.");
    }
}