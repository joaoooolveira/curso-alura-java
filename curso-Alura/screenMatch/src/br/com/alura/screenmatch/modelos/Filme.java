package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nomeFilme;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacaoDoFilme;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinuto(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nomeFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliarFilme(double notaDoFilme){
        avaliacaoDoFilme += notaDoFilme;
        totalDeAvaliacoes++;
    }

    public double returnMedias(){
        return avaliacaoDoFilme / totalDeAvaliacoes;
    }
}
