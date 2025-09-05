package SistemaDePagamento;

public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        service.processarPagamento(new FactoryCartaoCredito(), 150.00);

        service.processarPagamento(new FactoryPayPal(), 75.00);

        service.processarPagamento(new FactoryCriptomoeda(), 300.00);
    }
}
