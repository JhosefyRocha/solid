package srp;

public class PedidoViewer {
    public void exibirInformacoes(Pedido pedido) {
        System.out.println("--- Dados do Pedido ---");
        System.out.println("ID: " + pedido.getId());
        System.out.println("Valor: R$ " + pedido.getValorTotal());
    }
}
