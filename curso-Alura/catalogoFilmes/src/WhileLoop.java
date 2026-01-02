import java.util.Scanner;

public class WhileLoop {
    static void main() {
        Scanner whileScan = new Scanner(System.in);

        double avaliacaoFilme = 0;
        double mediaAvaliacao = 0;

        while (avaliacaoFilme != -1) {
            System.out.println("Diga sua avaliação para o filme");
            avaliacaoFilme = whileScan.nextDouble();
            mediaAvaliacao += avaliacaoFilme;
        }

        System.out.println(String.format("Média de avaliação: %.1f", (mediaAvaliacao/3)));

        whileScan.close();
    }
}
