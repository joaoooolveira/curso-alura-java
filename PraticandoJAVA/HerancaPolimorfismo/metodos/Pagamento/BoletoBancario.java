package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pagamento;

public class BoletoBancario extends Pagamento{
    private double taxa;

    public BoletoBancario(double preco) {
        super(preco);
    }

    @Override
    public double taxaPagamento() {
        return taxa = (getPreco() * 1) / 100;
    }

    @Override
    public void confirmarPagamento() {
        taxaPagamento();
        System.out.println("Boleto de R$%.2f gerado com sucesso. (Taxa: R$%.2f)".formatted(getPreco(), taxa));
    }
}
