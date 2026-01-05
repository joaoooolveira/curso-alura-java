import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    static void main() {
        Filme oPoderosoChefao = new Filme();
        oPoderosoChefao.setNomeTitulo("O poderoso chefão");
        oPoderosoChefao.setAnoDeLancamento(1970);
        oPoderosoChefao.setDuracaoEmMinutos(180);

        oPoderosoChefao.exibeFichaTecnica();
        System.out.println("Duração do filme: " + oPoderosoChefao.getDuracaoEmMinutos());

        oPoderosoChefao.avaliarTitulo(8);
        oPoderosoChefao.avaliarTitulo(7);
        oPoderosoChefao.avaliarTitulo(10);

        System.out.println("Total de avaliações: " + oPoderosoChefao.getTotalDeAvaliacoes());
        System.out.println(String.format("%.1f\n", oPoderosoChefao.returnMedias()));

        Filme avatarOCaminhoDaAgua = new Filme();
        avatarOCaminhoDaAgua.setNomeTitulo("Avatar: O Caminho da Água");
        avatarOCaminhoDaAgua.setAnoDeLancamento(2022);
        avatarOCaminhoDaAgua.setDuracaoEmMinutos(200);

        Serie lost = new Serie();
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
        System.out.println(calculadora.getTempoTotal());
    }
}
