package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pagamento;

public class CartaoCredito extends Pagamento{
    private double taxa;

    public CartaoCredito(double preco) {
        super(preco);
    }

    @Override
    public double taxaPagamento() {
        return taxa = (getPreco() * 3) / 100;
    }

    @Override
    public void confirmarPagamento() {
        taxaPagamento();
        System.out.println("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)".formatted(getPreco(), taxa));
    }
}
