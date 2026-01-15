package br.com.alura.PraticandoJAVA.Condicionais.metodos;

public class MediaDeNotas {
    private double nota1;
    private double nota2;
    private double nota3;

    public MediaDeNotas(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String verificarMedia(){
        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7){
            return "O estudante teve a média de %.1f e foi aprovado.".formatted(media);
        } else if(media >= 5 && media <= 6.9){
            return "O estudante teve a média de %.1f e está de recuperação.".formatted(media);
        } else {
            return "O estudante teve a média de %.1f e está reprovado.".formatted(media);
        }
    }

    @Override
    public String toString() {
        return verificarMedia();
    }
}
