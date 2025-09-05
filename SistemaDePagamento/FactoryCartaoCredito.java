// src/SistemaDePagamento/FactoryCartaoCredito.java
package SistemaDePagamento;

public class FactoryCartaoCredito extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        
        return new PagamentoCartaoCredito("4111111111111111");
    }
}
