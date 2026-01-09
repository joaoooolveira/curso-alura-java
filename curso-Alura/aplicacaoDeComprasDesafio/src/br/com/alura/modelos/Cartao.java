package br.com.alura.modelos;

public class Cartao {
    private double limiteCartao;

    public Cartao(double limiteCartao){
        this.limiteCartao = limiteCartao;
    }

    public boolean Comprar(double valor){
        if(valor <= limiteCartao){
            limiteCartao -= valor;
            return true;
        }
        return false;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }
}
