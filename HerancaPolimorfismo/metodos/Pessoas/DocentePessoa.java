package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pessoas;

public class DocentePessoa extends Pessoa{
    private String disciplina;

    public DocentePessoa(String nome, int idade, String disciplina) {
        super(nome, idade);

        if(disciplina == null || disciplina.isBlank()){
            throw new IllegalArgumentException("Digite a disciplina do docente.");
        }
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return """
                Docente: %s - Idade: %d - Disciplina %s""".formatted(getNome(), getIdade(), disciplina);
    }
}
