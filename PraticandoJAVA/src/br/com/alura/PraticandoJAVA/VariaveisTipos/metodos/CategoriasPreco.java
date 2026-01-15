package br.com.alura.PraticandoJAVA.VariaveisTipos.metodos;

public class CategoriasPreco {
    private double preco;

    public CategoriasPreco(double preco){
        this.preco = preco;
    }

    public String classificarPrecoEmCategorias(){
        if (preco > 0 && preco <= 50){
            return "Econômico";
        } else if (preco > 50 && preco <= 200){
            return "Intermediário";
        } else if (preco > 200){
            return "Premium";
        } else {
            return "Preço deve ser maior que zero.";
        }
    }

    @Override
    public String toString() {
        return "Categoria do produto: %s".formatted(classificarPrecoEmCategorias()) ;
    }
}
