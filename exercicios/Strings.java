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

    }
}
