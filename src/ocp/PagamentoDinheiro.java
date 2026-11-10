package ocp;

public class PagamentoDinheiro implements MetodoPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando R$ " + valor + " em Dinheiro.");
    }
}
