import srp.*;
import ocp.*;
import lsp.*;
import isp.*;
import dip.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. SRP ===");
        Pedido pedido = new Pedido(101, 85.50);
        PedidoRepository repo = new PedidoRepository();
        PedidoViewer viewer = new PedidoViewer();
        repo.salvar(pedido);
        viewer.exibirInformacoes(pedido);

        System.out.println("\n=== 2. OCP ===");
        MetodoPagamento pagamento = new PagamentoPix();
        pagamento.processar(pedido.getValorTotal());

        System.out.println("\n=== 3. LSP ===");
        Produto pizza = new Pizza("Pizza Calabresa", 45.00);
        Produto bebida = new Bebida("Refrigerante", 8.00);
        System.out.println("Item 1: " + pizza.getNome() + " - R$ " + pizza.getPrecoFinal());
        System.out.println("Item 2: " + bebida.getNome() + " - R$ " + bebida.getPrecoFinal());

        System.out.println("\n=== 4. ISP ===");
        ServicoSistema servico = new ServicoSistema();
        servico.gerenciarPedido();
        servico.gerenciarEntrega();

        System.out.println("\n=== 5. DIP ===");
        Notificador WhatsApp = new WhatsAppNotificador();
        CentralNotificacoes central = new CentralNotificacoes(WhatsApp);
        central.notificarCliente("Seu pedido saiu para entrega!");
    }
}
