package br.com.alura.PraticandoJAVA.metodos;

public class Notas {
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public Notas(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia(int quantidadeNotas){
        return media = (nota1 + nota2 + nota3) / quantidadeNotas;
    }

    @Override
    public String toString() {
        return """
                Média: %.1f""".formatted(media);
    }
}
