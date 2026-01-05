package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nomeFilme;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacaoDoFilme;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNomeFilme() {
        return nomeFilme;
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

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
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
