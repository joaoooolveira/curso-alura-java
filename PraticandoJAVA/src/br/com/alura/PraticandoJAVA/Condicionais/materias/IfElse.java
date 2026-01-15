package br.com.alura.PraticandoJAVA.Condicionais.materias;

import br.com.alura.PraticandoJAVA.Condicionais.metodos.Desconto;
import br.com.alura.PraticandoJAVA.Condicionais.metodos.MediaDeNotas;
import br.com.alura.PraticandoJAVA.Condicionais.metodos.ParImpar;
import br.com.alura.PraticandoJAVA.Condicionais.metodos.Senha;

import java.util.Scanner;
import java.util.SortedMap;

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
        System.out.println(verificarNumero + "\n");

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
        System.out.println(notas + "\n");

        //Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança dos acessos ao sistema interno.
        //Os funcionários utilizam uma senha fixa para acessar suas contas, e o sistema deve verificar se a senha inserida está correta.
        //
        //Ajude Jéssica a criar um programa que, com base em uma senha pré-definida, por exemplo: 123456,
        //verifique se o que o usuário digitou está correto ou não. O programa deve comparar
        //a tentativa com a senha correta e exibir se o acesso foi permitido ou negado.
        System.out.println("Exercício 3:");
        System.out.print("Digite a senha: ");
        String senha = leitura.next();

        Senha verificacao = new Senha();
        System.out.println(verificacao.verificarSenha(senha) + "\n");

        //Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um programa que
        //compare dois números inteiros fornecidos pelo usuário e informe qual é o maior ou se são iguais.
        //Mas, ele está com dificuldades para implementar a lógica de comparação e exibir o resultado corretamente.
        //
        //Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
        //compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.
        System.out.println("Exercício 4:");
        System.out.println("Digite dois números e descubra o maior entre eles");
        int num1 = leitura.nextInt();
        int num2 = leitura.nextInt();

        if(num1 > num2){
            System.out.printf("O número %d é maior que %d\n", num1, num2);
        } else if(num1 == num2){
            System.out.println("Os dois números são iguais.\n");
        } else {
            System.out.printf("O número %d é maior que %d\n", num2, num1);
        }

        //Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a um desconto de 10% em sua compra.
        // O desconto é aplicado apenas se o valor da compra for maior ou igual a R$ 100,00. Para isso,
        // ele quer um programa que permita inserir o valor da compra e exiba se o desconto foi aplicado ou não,
        // juntamente com o novo valor após o desconto, caso aplicável.
        //
        //Com base nesse cenário, crie um programa que receba o valor da compra
        // e exiba uma mensagem informando se o desconto foi aplicado ou não.
        System.out.println("Exercício 5:");
        System.out.println("Digite o preço: ");
        double preco = leitura.nextDouble();

        Desconto desconto = new Desconto();
        double novoPreco = desconto.verificandoDesconto(preco);
        if(desconto.temDesconto(preco)){
            System.out.println("Desconto de 10% aplicado!");
            System.out.printf("Valor final: R$%.2f", novoPreco);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor final: R$%.2f", novoPreco);
        }
    }
}