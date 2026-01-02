import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoExemplo {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(100);
        int numeroEscolhido = 0;
        int tentativas = 0;

        System.out.println("Digite seu nome: ");
        String nomeUsuario = leitor.nextLine();

        System.out.println(String.format("Beleza %s, vamos para o Jogo!", nomeUsuario));

        System.out.println("Tente adivinhar o número que eu estou pensando de 1 a 100!");

        while (tentativas < 5){
            System.out.println("Digite um número de 1 a 100:");
            numeroEscolhido = leitor.nextInt();
            tentativas++;

            if(numeroEscolhido == numeroGerado){
                System.out.println(String.format("Parabéns, você acertou em %d tentativas!",tentativas));
                break;
            } else if (numeroEscolhido > numeroGerado){
                System.out.println("O número que você digitou é maior que o número gerado.");
            } else {
                System.out.println("O número que você digitou é menor que o número gerado.");
            }
        }

        if (tentativas == 5 && numeroEscolhido != numeroGerado){
            System.out.println("Não foi dessa vez, o número gerado era: " + numeroGerado);
        }
    }
}
