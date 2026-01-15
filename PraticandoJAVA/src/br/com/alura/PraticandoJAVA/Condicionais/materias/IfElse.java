package br.com.alura.PraticandoJAVA.Condicionais.materias;

import br.com.alura.PraticandoJAVA.Condicionais.metodos.MediaDeNotas;
import br.com.alura.PraticandoJAVA.Condicionais.metodos.ParImpar;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        //Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo.
        //Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.
        //
        //Como você ajudaria Ana a escrever um programa que determine se um número é par ou ímpar e exiba o resultado corretamente?
        System.out.println("Exercício 1:");
        System.out.print("Digite o número: ");
        int numero = leitura.nextInt();

        ParImpar verificarNumero = new ParImpar(numero);
        System.out.println(verificarNumero);

        //Julia é professora e precisa de um programa que ajude a determinar se um aluno foi aprovado na disciplina. A regra da escola é:
        //
        //O estudante é aprovado se média final é maior ou igual a 7.0.
        //Se a média for entre 5.0 e 6.9, está de recuperação.
        //Se for abaixo de 5.0, está reprovado.
        //
        //Crie um programa que, a partir de uma variável media, exiba a situação do estudante conforme as regras da escola.
        System.out.println("Exercício 2:");
        System.out.println("Digite as notas do aluno: ");

        double nota1 = leitura.nextDouble();
        double nota2 = leitura.nextDouble();
        double nota3 = leitura.nextDouble();

        MediaDeNotas notas = new MediaDeNotas(nota1, nota2, nota3);
        System.out.println(notas);
    }
}