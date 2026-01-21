package br.com.alura.PraticandoJAVA.Encapsulamento.metodos;

public class Filme {
    private String nome;
    private double mediaAvaliacao;
    private int totalDeAvaliacoes;

    public Filme(String nome){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Digite o nome do filme.");
        }
        this.nome = nome;
    }

    public void avaliarFilme(double avaliacao){
        if(avaliacao <= 0 || avaliacao > 5){
            throw new IllegalArgumentException("Digite uma avaliação entre 1 e 5");
        }
        mediaAvaliacao += avaliacao;
        totalDeAvaliacoes++;
    }

    public double mediaDeAvaliacoes(){
        return mediaAvaliacao / totalDeAvaliacoes;
    }
}
