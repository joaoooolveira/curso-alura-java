package br.com.alura.PraticandoJAVA.Encapsulamento.metodos;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Insira o nome do produto.");
        }

        this.nome = nome;
        setPreco(preco);
    }

    @Override
    public String toString() {
        return """
                Produto: %s
                Preço: R$%.2f""".formatted(nome, preco);
    }

    private void setPreco(double preco){
        if(preco <= 0){
            System.out.println("Preço inválido.");
            this.preco = 0.0;
        }
        else {
            this.preco = preco;
        }
    }


}
