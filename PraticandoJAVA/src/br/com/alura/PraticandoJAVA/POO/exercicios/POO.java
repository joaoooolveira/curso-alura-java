package br.com.alura.PraticandoJAVA.POO.exercicios;

import br.com.alura.PraticandoJAVA.POO.metodos.*;

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
        System.out.println("Digite o nome, preço e quantidade do produto em estoque:");
        String nomeProduto = leitura.nextLine();
        double precoProduto = Double.parseDouble(leitura.nextLine());
        int quantidadeProduto = Integer.parseInt(leitura.nextLine());

        Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);

        System.out.println(produto);

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
        double saldo = Double.parseDouble(leitura.nextLine());

        Conta conta = new Conta(saldo);

        conta.exibirSaldo();

        conta.zerarSaldo();
        System.out.println("Conta zerada.");
        conta.exibirSaldo();
        System.out.println();

        //Imagine que você faz parte de uma equipe de agricultura tecnológica responsável por monitorar estufas inteligentes.
        // Cada setor possui sensores que coletam dados críticos para o crescimento das plantas.
        // Seu desafio é desenvolver um sistema que não apenas registre a temperatura, mas também alerte quando as condições saírem do ideal,
        // garantindo a saúde das culturas.
        //
        //Crie uma classe que:
        //
        //Possua os atributos local, indicando o setor monitorado, e temperatura atual, armazenando a última medição.
        //Implemente um método que mostre:
        //O local do sensor.
        //A temperatura formatada com uma casa decimal.
        //Um alerta se a temperatura ultrapassar 37.5ºC.
        System.out.print("Digite o setor: ");
        String setor = leitura.nextLine();

        System.out.print("Digite a temperatura do " + setor + ": ");
        double temperatura = Double.parseDouble(leitura.nextLine());

        Estufa estufa = new Estufa(setor, temperatura);

        System.out.println(estufa);
        estufa.verificarTemperatura();

        //Você está desenvolvendo um sistema de controle de colaboradores para uma empresa de tecnologia.
        // Às vezes, é necessário atualizar o cargo e o nível de acesso de um funcionário devido a promoções ou mudanças de departamento.
        // Seu programa deve permitir essas alterações e mostrar as informações atualizadas.
        //
        //Crie uma classe que:
        //
        //Represente um colaborador com os atributos nome, cargo e nivel de acesso.
        //Implemente um método que permita alterar o cargo e o nível de acesso.
        //Exiba no console as informações antes e depois da atualização.
        System.out.println("Digite os dados do colaborador.");

        System.out.print("Nome: ");
        String nomeColaborador = leitura.nextLine();

        System.out.print("Cargo: ");
        String cargoColaborador = leitura.nextLine();

        System.out.print("Nível de Acesso: ");
        int nivelDeAcessoColaborador = Integer.parseInt(leitura.nextLine());

        Colaboradores colaborador = new Colaboradores(nomeColaborador, cargoColaborador, nivelDeAcessoColaborador);

        System.out.println();
        System.out.println("--- Antes da atualização ---");
        System.out.println(colaborador);

        System.out.println();
        System.out.print("Novo cargo: ");
        String novoCargo = leitura.nextLine();

        System.out.print("Novo nível de acesso: ");
        int novoNivelDeAcesso = Integer.parseInt(leitura.nextLine());

        colaborador.promoverColaborador(novoCargo, novoNivelDeAcesso);

        System.out.println();
        System.out.println("--- Após atualização ---");
        System.out.println(colaborador);

    }


}
