package SistemaDePagamento;

public class FactoryCriptomoeda extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCriptomoeda(0.00);
    }
}
