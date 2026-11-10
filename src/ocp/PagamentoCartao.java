package ocp;

public class PagamentoCartao implements MetodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando R$ " + valor + " via Cartão de Crédito.");
    }
}
