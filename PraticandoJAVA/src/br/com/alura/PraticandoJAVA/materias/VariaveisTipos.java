package br.com.alura.PraticandoJAVA.materias;

import br.com.alura.PraticandoJAVA.metodos.Estudante;
import br.com.alura.PraticandoJAVA.metodos.Notas;

public class VariaveisTipos {
    public static void main(String[] args) {
        //Escreva um programa que declare variáveis para o seu nome, idade, altura e se você é estudante,
        // utilizando os tipos apropriados, e depois exiba os valores armazenados.

        System.out.println("Exercício 1:");
        Estudante maria = new Estudante("Maria", 25, 1.68, true);

        System.out.println(maria + "\n");

        //Você está desenvolvendo um sistema de gerenciamento de estoque que exige que as quantidades dos produtos sejam registradas como números inteiros.
        // Isso ocorre porque um estoque físico não pode conter frações de um item, por exemplo, não faz sentido ter "19.5" unidades de um produto.
        // No entanto, os dados disponíveis atualmente estão no formato double, que permite valores decimais.
        //
        //Para atender às exigências do sistema, crie um programa que converta a quantidade de double para int, garantindo que os valores sejam adequados ao formato aceito.
        System.out.println("Exercício 2:");
        double valorEntrada = 19.5;

        System.out.println((int) valorEntrada + "\n");

        //Você está desenvolvendo um aplicativo que calcula a média de notas dos alunos. Para isso, você precisa armazenar as notas em variáveis do tipo double.
        // Você decide criar três variáveis chamadas nota1, nota2 e nota3, e atribuir a elas os valores 7.5, 8.0 e 9.0, respectivamente e em seguida,
        // calcular a média e exibi-la na tela.
        System.out.println("Exercício 3:");
        Notas notas = new Notas(7.5, 8.0, 9.0);

        notas.calcularMedia(3);
        System.out.println(notas);
    }
}
