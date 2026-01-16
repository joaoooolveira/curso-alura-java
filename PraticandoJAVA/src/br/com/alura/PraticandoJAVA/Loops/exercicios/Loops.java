package br.com.alura.PraticandoJAVA.Loops.exercicios;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        //Carla começou a praticar trilha e deseja saber quantos degraus
        // precisará subir para chegar ao topo de uma escadaria.
        // Ela sobe um degrau por vez e quer um programa que mostre sua subida até o topo.
        // Sua tarefa é criar um programa que receba um número e simule a subida da escadaria.
        System.out.print("Digite a quantidade de degraus que deseja subir: ");
        int degraus = leitura.nextInt();

        if (degraus > 0){
            for (int i = 1; i <= degraus; i++) {
                System.out.println("Subindo o degrau: " + i);
            }
        } else {
            System.out.println("Digite um número válido.\n");

        }
        System.out.println();

        //João recebeu uma lista de valores representando as receitas de sua loja de roupas.
        // Ele quer calcular a soma total dessas receitas para entender o desempenho financeiro semanal.

        int[] valores = {10,20,30,40,50};
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
             soma += valores[i];
        }
        System.out.println(soma + "\n");

        //Maria quer calcular a soma de todos os números pares de 1 a 100.
        //Ela decidiu usar um loop para iterar pelos números e somar apenas aqueles divisíveis por 2.
        //Crie um programa que realize essa tarefa.
        int somaPares = 0;

        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0){
                somaPares += i;

            }
        }
        System.out.println(somaPares + "\n");

        //Pedro quer calcular o fatorial de um número. O fatorial de um número é o produto de todos os números inteiros positivos de 1 até o próprio número.
        // Crie um programa que receba um número e calcule seu fatorial.
        System.out.print("Digite o número para ver o fatorial dele: ");
        int numFatorial = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numFatorial; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
