import java.util.Scanner;

public class Conta {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nomeConta = "João Pedro de Oliveira";
        String tipoConta = "Corrente";
        double saldoConta = 2500.00;



        String dadosIniciais = """
                *********************************************
                Dados da conta:
                
                Nome:              %s
                Tipo da conta:     %s
                Saldo Inicial:     %.2f
                *********************************************\n""".formatted(nomeConta, tipoConta, saldoConta);

        System.out.println(dadosIniciais);

        String operacoes = """
                \n***********************
                Operações:
                
                1- Consultar saldo
                2- Depositar valor
                3- Sacar valor
                4- Sair
                ***********************\n""";

        int opcao = 0;
        double valorSaque = 0;
        double valorDeposito = 0;

        while (opcao != 4) {
            System.out.println(operacoes);

            System.out.println("Digite a opção desejada:");
            opcao = sc.nextInt();

            switch (opcao) {
                case (1):
                    System.out.println("Saldo atual: " + saldoConta);
                    break;
                case (2):
                    System.out.println("Digite o valor que deseja depositar:");
                    valorDeposito = sc.nextDouble();
                    saldoConta += valorDeposito;
                    System.out.println("Saldo atual: " + saldoConta);
                    break;
                case (3):
                    System.out.println("Digite o valor que deseja sacar: ");
                    valorSaque = sc.nextDouble();
                    if (valorSaque <= saldoConta) {
                        saldoConta -= valorSaque;
                        System.out.println(String.format("Valor de saque: %.2f, seu saldo atual é de %.2f", valorSaque, saldoConta));
                    } else {
                        System.out.println("Digite um valor abaixo do seu saldo atual.");
                    }
                    break;
                case (4):
                    break;
                default:
                    System.out.println("Digite um número válido.");
            }
        }
    }
}
