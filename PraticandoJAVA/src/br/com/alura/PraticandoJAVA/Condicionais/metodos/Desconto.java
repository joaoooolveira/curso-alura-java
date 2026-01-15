package br.com.alura.PraticandoJAVA.Condicionais.metodos;

public class Desconto {
    private int porcentagem = 10;

    public double verificandoDesconto(double preco){
        if(preco >= 100){
            return preco - (preco * porcentagem) / 100;
        } else {
            return preco;
        }
    }

    public boolean temDesconto(double preco){
        return preco >= 100;
    }
}
