package srp;

public class PedidoRepository {
    public void salvar(Pedido pedido) {
        System.out.println("Salvando pedido #" + pedido.getId() + " no banco de dados.");
    }
}
