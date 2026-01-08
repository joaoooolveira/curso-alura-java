package horaDaPratica.classes.Arraylist;

public class PessoaArray {
    private String nome;
    private int idade;

    public PessoaArray(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "(" + idade + ")";
    }
}
