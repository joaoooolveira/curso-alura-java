import java.util.Scanner;

public class WhileLoop {
    static void main() {
        Scanner whileScan = new Scanner(System.in);

        double avaliacaoFilme = 0;
        double mediaAvaliacao = 0;
        int totalNotas = 0;

        while (avaliacaoFilme != -1) {
            System.out.println("Diga sua avaliação para o filme");
            avaliacaoFilme = whileScan.nextDouble();

            if(avaliacaoFilme != -1) {
                mediaAvaliacao += avaliacaoFilme;
                totalNotas++;
            }
        }

        System.out.println(String.format("Média de avaliação: %.1f", (mediaAvaliacao/totalNotas)));

        whileScan.close();
    }
}
