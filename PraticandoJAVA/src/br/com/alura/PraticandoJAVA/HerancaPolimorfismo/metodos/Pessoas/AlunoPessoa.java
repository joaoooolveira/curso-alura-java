package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pessoas;

public class AlunoPessoa extends Pessoa{
    private double nota;

    public AlunoPessoa(String nome, int idade, double nota) {
        super(nome, idade);

        if(nota < 0 || nota > 10){
            throw new IllegalArgumentException("A nota do aluno deve ser entre 0 e 10.");
        }
        this.nota = nota;
    }

    @Override
    public String toString() {
        return """
                Aluno: %s - Idade: %d - Nota: %.1f""".formatted(getNome(), getIdade(), nota);
    }
}
