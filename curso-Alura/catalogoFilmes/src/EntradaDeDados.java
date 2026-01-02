import java.util.Scanner;

public class EntradaDeDados {
    static void main() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filmeFavorito = leitura.nextLine();

        System.out.println("Qual o ano de lançamento desse filme?");
        int anoLancamento = leitura.nextInt();

        System.out.println("Diga sua avaliação para o filme");
        double avaliacaoFilme = leitura.nextDouble();

        String resumoFinal = """
                Filme favorito: %s
                Ano de lançamento: %d
                Avaliação pessoal: %.1f""".formatted(filmeFavorito,anoLancamento,avaliacaoFilme);

        System.out.println(resumoFinal);

        leitura.close();
    }
}
