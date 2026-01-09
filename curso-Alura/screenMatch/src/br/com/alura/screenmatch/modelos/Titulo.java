package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nomeTitulo;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nomeTitulo, int anoDeLancamento){
        this.nomeTitulo = nomeTitulo;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNomeTitulo() {
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
        System.out.println("Título: " + nomeTitulo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliarTitulo(double notaDoTitulo) {
        avaliacao += notaDoTitulo;
        totalDeAvaliacoes++;
    }

    public double returnMedias() {
        return avaliacao / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getNomeTitulo().compareTo(titulo.getNomeTitulo());
    }
}
