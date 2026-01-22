package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pagamento;

public abstract class Pagamento {
    private double preco;

    public Pagamento(double preco){
        if(preco <= 0){
            throw new IllegalArgumentException("Digite um valor válido.");
        }

        this.preco = preco;
    }

    public abstract double taxaPagamento();

    public abstract void confirmarPagamento();

    public double getPreco() {
        return preco;
    }
}
