package br.com.alura.PraticandoJAVA.POO.metodos;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        if(nome.isBlank()){
            throw new IllegalArgumentException("O nome do produto não pode estar em branco.");
        }
        if(preco <= 0){
            throw new IllegalArgumentException("Preço deve ser maior que zero.");
        }
        if(quantidade <= 0){
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return """
                Produto: %s
                Preço: %.2f
                Quantidade: %d\n""".formatted(nome, preco, quantidade);
    }
}
