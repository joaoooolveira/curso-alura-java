package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nomeTitulo;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNomeFilme() {
        return nomeTitulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nomeTitulo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliarTitulo(double notaDoTitulo) {
        avaliacao += notaDoTitulo;
        totalDeAvaliacoes++;
    }

    public double returnMedias() {
        return avaliacao / totalDeAvaliacoes;
    }
}
