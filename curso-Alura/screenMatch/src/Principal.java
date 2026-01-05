import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    static void main() {
        Filme filme = new Filme();
        filme.setNomeTitulo("O poderoso chefão");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMinutos(180);

        filme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());

        filme.avaliarTitulo(8);
        filme.avaliarTitulo(7);
        filme.avaliarTitulo(10);

        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.println(String.format("%.1f\n", filme.returnMedias()));

        Serie serie = new Serie();
        serie.setNomeTitulo("Lost");
        serie.setAnoDeLancamento(2000);
        serie.setTemporadasDaSerie(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        serie.exibeFichaTecnica();
        System.out.println("Duração total da série: " + serie.getDuracaoEmMinutos());
    }
}
