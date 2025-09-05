// src/SistemaDePagamento/PagamentoCriptomoeda.java
package SistemaDePagamento;

public class PagamentoCriptomoeda implements Pagamento {
    private double saldoCarteira;

    public PagamentoCriptomoeda(double saldoInicial) {
        this.saldoCarteira = saldoInicial;
    }

    private boolean saldoSuficiente(double valor) {
        return saldoCarteira >= valor;
    }

    @Override
    public String processarPagamento(double valor) {
        if (!saldoSuficiente(valor)) {
            return String.format(
                "Erro (Criptomoedas): saldo insuficiente. Saldo atual: R$ %.2f, Valor: R$ %.2f",
                saldoCarteira, valor
            );
        }
        saldoCarteira -= valor;
        return String.format(
            "Pagamento aprovado em Criptomoedas: R$ %.2f (saldo restante: R$ %.2f)",
            valor, saldoCarteira
        );
    }
}
