package SistemaDePagamento;

public class PagamentoService {
    // O cliente não sabe qual implementação concreta está usando
    public String processarPagamento(PagamentoFactory factory, double valor) {
        Pagamento pagamento = factory.criarPagamento();
        String resultado = pagamento.processarPagamento(valor);
        System.out.println(resultado);
        return resultado;
    }
}