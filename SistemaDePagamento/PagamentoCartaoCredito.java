package SistemaDePagamento;

public class PagamentoCartaoCredito implements Pagamento {
    
    public String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    private boolean validarNumero() {
        return numeroCartao != null && numeroCartao.matches("\\d{16}");
    }

    @Override
    public String processarPagamento(double valor) {
        if (!validarNumero()) {
            return "Erro (Cartão): número do cartão inválido (precisa ter 16 dígitos).";
        }
        return String.format("Pagamento aprovado no Cartão de Crédito: R$ %.2f", valor);
    }
}