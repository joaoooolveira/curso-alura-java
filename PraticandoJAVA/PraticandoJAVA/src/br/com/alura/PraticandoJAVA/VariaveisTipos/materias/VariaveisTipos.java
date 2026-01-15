package br.com.alura.PraticandoJAVA.VariaveisTipos.materias;

import br.com.alura.PraticandoJAVA.VariaveisTipos.metodos.CategoriasPreco;
import br.com.alura.PraticandoJAVA.VariaveisTipos.metodos.ConversaoDeTemperatura;
import br.com.alura.PraticandoJAVA.VariaveisTipos.metodos.Estudante;
import br.com.alura.PraticandoJAVA.VariaveisTipos.metodos.Notas;

import java.util.Scanner;

public class VariaveisTipos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //Escreva um programa que declare variáveis para o seu nome, idade, altura e se você é estudante,
        //utilizando os tipos apropriados, e depois exiba os valores armazenados.

        System.out.println("Exercício 1:");
        Estudante maria = new Estudante("Maria", 25, 1.68, true);

        System.out.println(maria + "\n");

        //Você está desenvolvendo um sistema de gerenciamento de estoque que exige que as quantidades dos produtos sejam registradas como números inteiros.
        //Isso ocorre porque um estoque físico não pode conter frações de um item, por exemplo, não faz sentido ter "19.5" unidades de um produto.
        //No entanto, os dados disponíveis atualmente estão no formato double, que permite valores decimais.
        //
        //Para atender às exigências do sistema, crie um programa que converta a quantidade de double para int, garantindo que os valores sejam adequados ao formato aceito.
        System.out.println("Exercício 2:");
        double valorEntrada = 19.5;

        System.out.println((int) valorEntrada + "\n");

        //Você está desenvolvendo um aplicativo que calcula a média de notas dos alunos. Para isso, você precisa armazenar as notas em variáveis do tipo double.
        //Você decide criar três variáveis chamadas nota1, nota2 e nota3, e atribuir a elas os valores 7.5, 8.0 e 9.0, respectivamente e em seguida,
        //calcular a média e exibi-la na tela.
        System.out.println("Exercício 3:");
        Notas notas = new Notas(7.5, 8.0, 9.0);

        notas.calcularMedia();
        System.out.println(notas + "\n");

        //Você está desenvolvendo um sistema de monitoramento de temperatura para uma estufa de plantas.
        //Você recebe os dados de temperatura em graus Celsius, mas precisa exibi-los em Fahrenheit
        //para um relatório que será enviado para um cliente nos Estados Unidos.
        //
        //Crie um programa que receba uma temperatura em graus Celsius (int) e exiba a temperatura convertida
        //em graus Fahrenheit (double).
        System.out.println("Exercício 4:");
        System.out.print("Digite a temperatura atual: ");
        double celsius = leitura.nextDouble();

        ConversaoDeTemperatura converter = new ConversaoDeTemperatura(celsius);
        System.out.println(converter + "\n");

        //Você trabalha em um e-commerce e precisa classificar os produtos em diferentes categorias com base no preço.
        //
        //Escreva um programa que classifique um produto em uma categoria com base
        //em um preço e exiba a categoria correspondente, conforme as seguintes regras:
        //
        //Econômico: preço até R$ 50,00.
        //Intermediário: preço entre R$ 50,01 e R$ 200,00.
        //Premium: preço acima de R$ 200,00.
        System.out.println("Exercício 5:");
        System.out.print("Digite o preço do produto: ");
        double preco = leitura.nextDouble();

        CategoriasPreco categoria = new CategoriasPreco(preco);
        System.out.println(categoria);
    }
}
