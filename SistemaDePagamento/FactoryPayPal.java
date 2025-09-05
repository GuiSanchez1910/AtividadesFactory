package SistemaDePagamento;

public class FactoryPayPal extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPayPal("cliente@exemplo.com");
    }
}
