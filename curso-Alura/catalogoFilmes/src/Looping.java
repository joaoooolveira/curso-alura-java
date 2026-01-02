import java.util.Scanner;

public class Looping {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        double avaliacaoFilme = 0;
        double mediaAvaliacao = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme");
            avaliacaoFilme = leitura.nextDouble();
            mediaAvaliacao += avaliacaoFilme;
        }

        System.out.println(String.format("Média de avaliação: %.1f", (mediaAvaliacao/3)));

        leitura.close();
    }
}
