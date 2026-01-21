package br.com.alura.PraticandoJAVA.HerancaPolimorfismo.exercicios;

import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Aluno.Aluno;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Aluno.Bolsista;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pessoas.AlunoPessoa;
import br.com.alura.PraticandoJAVA.HerancaPolimorfismo.metodos.Pessoas.DocentePessoa;

public class Heranca {
    public static void main(String[] args){
        //Você está construindo um sistema acadêmico para uma escola. Cada aluno possui um nome e pode ser identificado no sistema com uma mensagem padrão.
        // A escola também possui alunos bolsistas. Para deixar o sistema mais informativo,
        // queremos exibir o tipo do aluno no momento da identificação, como "bolsista" ou "regular".
        //
        //Crie um programa que:
        //
        //Defina uma classe Aluno com nome e tipo.
        //Crie um método identificar() que que imprime: "Aluno: [nome] - Tipo: [tipo]".
        //Crie uma classe Bolsista que herda de Aluno e define o tipo automaticamente como "bolsista".
        // Crie um objeto Aluno regular e um Bolsista, e chame o método identificar() de cada um.
        Aluno aluno1 = new Aluno("Fernanda", "Regular");
        Bolsista aluno2 = new Bolsista("João");

        aluno1.identificarAluno();
        aluno2.identificarAluno();
        System.out.println();

        //Você está desenvolvendo um sistema de gestão para uma escola, onde é necessário organizar informações de alunos e docentes.
        // Cada pessoa na escola possui dados básicos, como nome e idade. No entanto, cada grupo também possui características próprias:
        // os alunos possuem uma nota final e os docentes são responsáveis por uma disciplina.
        //
        //Crie um programa que:
        //
        //Defina uma classe Pessoa com os atributos nome e idade.
        //Crie as classes Aluno e Docente, ambas herdando de Pessoa, adicionando:
        //Para Aluno: um atributo nota.
        //Para Docente: um atributo disciplina.
        //Instancie dois objetos Aluno e dois objetos Docente
        //Exiba as informações no terminal.
        AlunoPessoa alunoPessoa1 = new AlunoPessoa("Julia", 16, 8.5);
        AlunoPessoa alunoPessoa2 = new AlunoPessoa("Caio", 17, 7.2);
        DocentePessoa docentePessoa1 = new DocentePessoa("Marta", 40, "Matemática");
        DocentePessoa docentePessoa2 = new DocentePessoa("Roberto", 38, "História");

        System.out.println(alunoPessoa1);
        System.out.println(alunoPessoa2);
        System.out.println(docentePessoa1);
        System.out.println(docentePessoa2);
        System.out.println();
    }
}
