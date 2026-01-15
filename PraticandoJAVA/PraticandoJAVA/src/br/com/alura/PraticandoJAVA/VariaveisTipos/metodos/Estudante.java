package br.com.alura.PraticandoJAVA.VariaveisTipos.metodos;

public class Estudante {
    private String nome;
    private int idade;
    private double altura;
    private boolean isEstudante;

    public Estudante(String nome, int idade, double altura, boolean isEstudante){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.isEstudante = isEstudante;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Idade: %d
                Altura: %.2f
                É estudante? %b""".formatted(nome, idade, altura, isEstudante);
    }
}
