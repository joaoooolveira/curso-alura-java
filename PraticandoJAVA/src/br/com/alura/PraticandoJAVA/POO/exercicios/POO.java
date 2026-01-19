package br.com.alura.PraticandoJAVA.POO.exercicios;

import br.com.alura.PraticandoJAVA.POO.metodos.Conta;
import br.com.alura.PraticandoJAVA.POO.metodos.Livro;
import br.com.alura.PraticandoJAVA.POO.metodos.Produto;

import java.util.Scanner;

public class POO {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        //Imagine que você é responsável pelo controle de estoque de uma loja de informática que está expandindo seus negócios.
        // Com o aumento da demanda, é importante manter um registro organizado e preciso de todos os produtos disponíveis.
        // Sua tarefa é criar um sistema que armazene as informações de cada item e gere um relatório para facilitar a gestão do estoque.
        //
        //Sua tarefa é criar uma classe que:
        //
        //Represente um produto com os atributos nome, preço e quantidade.
        //Implemente um método que mostre os dados formatados, garantindo que o preço seja exibido com duas casas decimais.
//        System.out.println("Digite o nome, preço e quantidade do produto em estoque:");
//        String nomeProduto = leitura.nextLine();
//        double precoProduto = leitura.nextDouble();
//        int quantidadeProduto = leitura.nextInt();
//
//        Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
//
//        System.out.println(produto);

        //Imagine que você está criando um sistema de catalogação para uma biblioteca.
        // Seu objetivo é desenvolver uma estrutura que armazene dados de obras literárias e as exiba em um formato padronizado,
        // facilitando a consulta por outros leitores.
        //
        //Crie um programa que:
        //
        //Defina uma classe com os atributos título, autor e páginas.
        //Implemente um método que use printf para mostrar os dados no formato: "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.
        System.out.println("Digite o título, autor e número de páginas:");
        String tituloLivro = leitura.nextLine();
        String autorLivro = leitura.nextLine();
        int paginasLivro = Integer.parseInt(leitura.nextLine());

        Livro livro = new Livro(tituloLivro, autorLivro, paginasLivro);

        System.out.println(livro);

        //Imagine que você está desenvolvendo um sistema de conta digital onde os usuários podem realizar transações financeiras.
        // Em determinadas situações, como encerramento de conta, é necessário zerar o saldo disponível.
        //
        //Crie um programa que:
        //
        //Defina uma classe com o atributo saldo.
        //Implemente um método que redefine o valor do saldo para 0.0.
        //Implemente um método que mostra o saldo atual formatado.
        System.out.print("Saldo da conta: ");
        double saldo = leitura.nextDouble();

        Conta conta = new Conta(saldo);

        conta.exibirSaldo();

        conta.zerarSaldo();
        System.out.println("Conta zerada.");
        conta.exibirSaldo();
    }


}
