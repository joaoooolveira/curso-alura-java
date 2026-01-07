import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main() {
        Filme oPoderosoChefao = new Filme();
        Filme avatarOCaminhoDaAgua = new Filme();
        Serie lost = new Serie();
        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();

        oPoderosoChefao.setNomeTitulo("O poderoso chefão");
        oPoderosoChefao.setAnoDeLancamento(1970);
        oPoderosoChefao.setDuracaoEmMinutos(180);

        oPoderosoChefao.exibeFichaTecnica();
        System.out.println("Duração do filme: " + oPoderosoChefao.getDuracaoEmMinutos());

        oPoderosoChefao.avaliarTitulo(8);
        oPoderosoChefao.avaliarTitulo(7);
        oPoderosoChefao.avaliarTitulo(10);

        System.out.println("Total de avaliações: " + oPoderosoChefao.getTotalDeAvaliacoes());
        System.out.println(String.format("%.1f", oPoderosoChefao.returnMedias()));
        filtro.filtragem(oPoderosoChefao);

        System.out.println();

        avatarOCaminhoDaAgua.setNomeTitulo("Avatar: O Caminho da Água");
        avatarOCaminhoDaAgua.setAnoDeLancamento(2022);
        avatarOCaminhoDaAgua.setDuracaoEmMinutos(200);

        lost.setNomeTitulo("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadasDaSerie(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração total da série: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.incluiTitulo(oPoderosoChefao);
        calculadora.incluiTitulo(avatarOCaminhoDaAgua);
        calculadora.incluiTitulo(lost);

        Episodio episodio = new Episodio();
        episodio.setNumeroDoEpisodio(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtragem(episodio);

        var dogville = new Filme();
        dogville.setNomeTitulo("Dogville");
        dogville.setDuracaoEmMinutos(200);
        dogville.setAnoDeLancamento(2003);
        dogville.avaliarTitulo(8);

        System.out.println("\nMinha Lista: ");
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(oPoderosoChefao);
        listaDeFilmes.add(avatarOCaminhoDaAgua);
        listaDeFilmes.add(dogville);

        System.out.println("Quantidade de filmes: " + listaDeFilmes.size());
        for (int i = 0; i < listaDeFilmes.size(); i++) {
            System.out.println(listaDeFilmes.get(i).getNomeFilme());
        }
    }
}
