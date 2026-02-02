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

        //Ana está desenvolvendo um sistema de edição de textos e precisa substituir uma palavra específica por outra em um texto. Crie um programa que:
        //
        //Receba um texto, uma palavra a ser substituída e uma nova palavra, exiba o texto com as substituições realizadas.
        //Se a palavra a ser substituída não for encontrada no texto, o programa deve informar ao usuário que a palavra não foi encontrada e encerrar a execução.
        System.out.print("Digite o texto: ");
        String textoAntigo = sc.nextLine();

        System.out.print("Digite a palavra a ser substituída: ");
        String palavraAntiga = sc.nextLine();

        if(!textoAntigo.contains(palavraAntiga)){
            System.out.println("Palavra não encontrada.");
            return;
        }

        System.out.print("Digite a nova palavra: ");
        String novaPalavra = sc.nextLine();

        String novoTexto = textoAntigo.replace(palavraAntiga, novaPalavra);
        System.out.println("Texto alterado: " + novoTexto);
        System.out.println();

        //Pedro está desenvolvendo um sistema de processamento de arquivos e precisa extrair o nome do arquivo sem a extensão.
        // Crie um programa que receba o nome de um arquivo e exiba o nome sem a extensão.
        System.out.print("Digite o nome do arquivo: ");
        String arquivo = sc.nextLine();

        int posicaoPonto = arquivo.indexOf(".");
        if(posicaoPonto != -1){
            String arquivoSemExtensao = arquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + arquivoSemExtensao);
            System.out.println();
        } else {
            System.out.println("Arquivo não possui extensão.\n");
        }


    }
}
