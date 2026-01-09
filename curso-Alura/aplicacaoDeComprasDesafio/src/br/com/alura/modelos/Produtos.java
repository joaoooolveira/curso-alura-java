package br.com.alura.modelos;

public class Produtos {
    private String nomeProduto;
    private double valorProduto;

    public Produtos(String nomeProduto, double valorProduto){
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return "Produto: " + this.getNomeProduto() + "(" + this.getValorProduto() + ")";
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }


}
