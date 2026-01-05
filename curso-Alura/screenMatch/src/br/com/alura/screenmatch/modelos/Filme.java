package br.com.alura.screenmatch.modelos;

public class Filme {
    String nomeFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double avaliacaoDoFilme;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avaliarFilme(double notaDoFilme){
        avaliacaoDoFilme += notaDoFilme;
        totalDeAvaliacoes++;
    }

    double returnMedias(){
        return avaliacaoDoFilme / totalDeAvaliacoes;
    }
}
