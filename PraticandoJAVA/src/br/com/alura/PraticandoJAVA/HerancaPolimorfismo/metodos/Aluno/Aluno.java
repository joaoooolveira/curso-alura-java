package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Aluno;

public class Aluno {
    private String nomeAluno;
    private String tipo;

    public Aluno(String nomeAluno, String tipo){
        if(nomeAluno == null || nomeAluno.isBlank()){
            throw new IllegalArgumentException("Digite o nome do aluno.");
        }
        if(tipo == null || nomeAluno.isBlank()){
            throw new IllegalArgumentException("Digite o tipo de matrícula do aluno.");
        }
        this.nomeAluno = nomeAluno;
        this.tipo = tipo;
    }

    public void identificarAluno(){
        System.out.println("Aluno: " + nomeAluno + " - Matrícula: " + tipo);
    }
}
