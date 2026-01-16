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

        System.out.println("Fatorial de " + numFatorial + " é: " + fatorial + "\n");

        //Carlos tem uma lista de números e quer descobrir qual é o maior valor. Para isso, ele decidiu percorrer a lista comparando cada número
        // com o maior encontrado até o momento. Crie um programa que receba uma lista de números e encontre o maior número.
        int[] listaDeNumeros = new int[5];

        System.out.println("Digite 5 números em ordem(com espaço) e descubra qual o maior:");
        for (int i = 0; i < 5; i++) {
            listaDeNumeros[i] = leitura.nextInt();
        }

        int maiorNumero = listaDeNumeros[0];

        for (int i = 0; i < 5; i++) {
            if(listaDeNumeros[i] > maiorNumero){
                maiorNumero = listaDeNumeros[i];
            }
        }

        System.out.println("O maior número é: " + maiorNumero + "\n");

        //Leonardo trabalha no setor de segurança de um sistema bancário e precisa garantir que os usuários tenham um número
        // limitado de tentativas para inserir a senha corretamente. Se o usuário errar a senha 3 vezes seguidas, sua conta deve ser bloqueada temporariamente.
        //
        //Com base nesse cenário, crie um programa que peça uma senha ao usuário e permita até 3 tentativas de erro antes de bloquear o acesso.
        // Se o usuário digitar corretamente antes disso, o sistema deve conceder o acesso imediatamente.
        int tentativas = 0;
        String senhaCorreta = "1234";

        while(tentativas <= 2){
            System.out.print("Digite a senha: ");
            String senha = leitura.next();

            if(senhaCorreta.equals(senha)){
                System.out.println("Acesso liberado!");
                break;
            } else {
                System.out.println("Senha incorreta.");
                tentativas++;
            }
        }

        if(tentativas == 3){
            System.out.println("Conta bloqueada temporariamente.");
        }
    }
}
