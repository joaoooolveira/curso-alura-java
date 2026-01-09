package horaDaPratica.classes.Arraylist;

public class ProdutoPerecivel extends ProdutoConstructor{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return """
                
                Produto: %s (%d)
                Preço: %.2f
                Data de validade: %s""".formatted(getNome(), getQuantidade(), getPreco(), dataValidade);
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
