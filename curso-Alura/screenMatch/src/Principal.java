import br.com.alura.screenmatch.modelos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    static void main() {
        Filme poderosoChefao = new Filme();
        poderosoChefao.setNomeTitulo("O poderoso chefão");
        poderosoChefao.setAnoDeLancamento(1970);
        poderosoChefao.setDuracaoEmMinutos(180);

        poderosoChefao.exibeFichaTecnica();
        System.out.println("Duração do filme: " + poderosoChefao.getDuracaoEmMinutos());

        poderosoChefao.avaliarTitulo(8);
        poderosoChefao.avaliarTitulo(7);
        poderosoChefao.avaliarTitulo(10);

        System.out.println("Total de avaliações: " + poderosoChefao.getTotalDeAvaliacoes());
        System.out.println(String.format("%.1f\n", poderosoChefao.returnMedias()));

        Filme avatarCaminhoDaAgua = new Filme();

        avatarCaminhoDaAgua.setNomeTitulo("Avatar: Caminho da Água");
        avatarCaminhoDaAgua.setAnoDeLancamento(2022);
        avatarCaminhoDaAgua.setDuracaoEmMinutos(200);

        Serie lost = new Serie();
        lost.setNomeTitulo("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadasDaSerie(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração total da série: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiTempo(poderosoChefao);
        calculadora.incluiTempo(avatarCaminhoDaAgua);
        calculadora.incluiTempo(lost);

        System.out.println(calculadora.getTempoTotal());
    }
}
