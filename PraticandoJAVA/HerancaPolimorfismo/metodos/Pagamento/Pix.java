package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pagamento;

public class Pix extends Pagamento{

    public Pix(double preco) {
        super(preco);
    }

    @Override
    public double taxaPagamento() {
        return 0;
    }

    @Override
    public void confirmarPagamento() {
        System.out.println("Pagamento via pix de R$%.2f confirmado.".formatted(getPreco()));
    }
}
