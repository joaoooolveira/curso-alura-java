package br.com.alura.PraticandoJAVA.metodos;

public class Estudante {
    private String nome;
    private int idade;
    private double altura;
    private boolean estudaOuNao;

    public Estudante(String nome, int idade, double altura, boolean estudaOuNao){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.estudaOuNao = estudaOuNao;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Idade: %d
                Altura: %.2f
                É estudante? %b""".formatted(nome, idade, altura, estudaOuNao);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isEstudaOuNao() {
        return estudaOuNao;
    }
}
