package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pessoas;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome é obrigatório.");
        }
        if(idade <= 0 || idade > 100){
            throw new IllegalArgumentException("Digite a idade correta.");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
