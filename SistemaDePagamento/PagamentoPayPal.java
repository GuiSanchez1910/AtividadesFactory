package SistemaDePagamento;

public class PagamentoPayPal implements Pagamento {
    private final String emailUsuario;

    public PagamentoPayPal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    private boolean contaVinculada() {
        return "cliente@exetmplo.com".equalsIgnoreCase(emailUsuario);
    }

    @Override
    public String processarPagamento(double valor) {
        if (!contaVinculada()) {
            return "Erro (PayPal): e-mail não vinculado a uma conta PayPal.";
        }
        return String.format("Pagamento aprovado no PayPal: R$ %.2f", valor);
    }
}
