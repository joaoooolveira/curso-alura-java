package horaDaPratica.classes.Arraylist;

public class ProdutoConstructor {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoConstructor(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return """
                
                Produto: %s (%d)
                Preço: %.2f""".formatted(nome, quantidade, preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
