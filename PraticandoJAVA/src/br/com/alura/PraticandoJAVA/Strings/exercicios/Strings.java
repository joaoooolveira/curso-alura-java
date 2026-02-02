package br.com.alura.PraticandoJAVA.Strings.exercicios;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Joana está desenvolvendo um sistema de cadastro de usuários e percebeu que muitos nomes estão sendo cadastrados com espaços
        // em branco no início ou no final. Ela quer um programa que remova esses espaços automaticamente.
        //
        //Crie um programa que receba um nome e exiba o nome sem espaços em branco no início ou no final.
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        String nomeFormatado = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormatado + "\n");

        //Carlos está desenvolvendo um sistema de relatórios e precisa padronizar o texto para que todos os títulos estejam em maiúsculas
        // e as descrições em minúsculas. Faça um programa que receba um texto e exiba o texto em maiúsculas e o texto em minúsculas.
        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();

        String caixaAlta = texto.toUpperCase();
        String caixaBaixa = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + caixaAlta);
        System.out.println("Texto em minúsculas: " + caixaBaixa);
        System.out.println();

        
    }
}
